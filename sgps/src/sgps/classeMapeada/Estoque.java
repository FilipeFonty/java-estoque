/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "ESTOQUE", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e"),
    @NamedQuery(name = "Estoque.findByIdestoque", query = "SELECT e FROM Estoque e WHERE e.estoquePK.idestoque = :idestoque"),
    @NamedQuery(name = "Estoque.findByTipooperacaoestoque", query = "SELECT e FROM Estoque e WHERE e.estoquePK.tipooperacaoestoque = :tipooperacaoestoque"),
    @NamedQuery(name = "Estoque.findByDatamovimentoestoque", query = "SELECT e FROM Estoque e WHERE e.datamovimentoestoque = :datamovimentoestoque"),
    @NamedQuery(name = "Estoque.findByDocumentoestoque", query = "SELECT e FROM Estoque e WHERE e.documentoestoque = :documentoestoque"),
    @NamedQuery(name = "Estoque.findByUnidademedidaestoque", query = "SELECT e FROM Estoque e WHERE e.unidademedidaestoque = :unidademedidaestoque"),
    @NamedQuery(name = "Estoque.findByQuantidadeestoque", query = "SELECT e FROM Estoque e WHERE e.quantidadeestoque = :quantidadeestoque"),
    @NamedQuery(name = "Estoque.findByQtdeentradaestoque", query = "SELECT e FROM Estoque e WHERE e.qtdeentradaestoque = :qtdeentradaestoque"),
    @NamedQuery(name = "Estoque.findByQtdesaidaestoque", query = "SELECT e FROM Estoque e WHERE e.qtdesaidaestoque = :qtdesaidaestoque"),
    @NamedQuery(name = "Estoque.findByValorcustoestoque", query = "SELECT e FROM Estoque e WHERE e.valorcustoestoque = :valorcustoestoque"),
    @NamedQuery(name = "Estoque.findByValorvendaestoque", query = "SELECT e FROM Estoque e WHERE e.valorvendaestoque = :valorvendaestoque"),
    @NamedQuery(name = "Estoque.findByFlagestornadoestoque", query = "SELECT e FROM Estoque e WHERE e.flagestornadoestoque = :flagestornadoestoque"),
    @NamedQuery(name = "Estoque.findByFlagmovimentaestoque", query = "SELECT e FROM Estoque e WHERE e.flagmovimentaestoque = :flagmovimentaestoque"),
    @NamedQuery(name = "Estoque.findByCodigoentradaestoque", query = "SELECT e FROM Estoque e WHERE e.estoquePK.codigoentradaestoque = :codigoentradaestoque"),
    @NamedQuery(name = "Estoque.findByCodigovendaestoque", query = "SELECT e FROM Estoque e WHERE e.codigovendaestoque = :codigovendaestoque"),
    @NamedQuery(name = "Estoque.findByStatusitemestoque", query = "SELECT e FROM Estoque e WHERE e.statusitemestoque = :statusitemestoque")})
public class Estoque implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstoquePK estoquePK;
    @Column(name = "DATAMOVIMENTOESTOQUE")
    @Temporal(TemporalType.DATE)
    private Date datamovimentoestoque;
    @Column(name = "DOCUMENTOESTOQUE")
    private Integer documentoestoque;
    @Column(name = "UNIDADEMEDIDAESTOQUE", length = 2)
    private String unidademedidaestoque;
    @Column(name = "QUANTIDADEESTOQUE", precision = 4, scale = 2)
    private BigDecimal quantidadeestoque;
    @Column(name = "QTDEENTRADAESTOQUE", precision = 11, scale = 2)
    private BigDecimal qtdeentradaestoque;
    @Column(name = "QTDESAIDAESTOQUE", precision = 11, scale = 2)
    private BigDecimal qtdesaidaestoque;
    @Column(name = "VALORCUSTOESTOQUE", precision = 11, scale = 2)
    private BigDecimal valorcustoestoque;
    @Column(name = "VALORVENDAESTOQUE", precision = 11, scale = 2)
    private BigDecimal valorvendaestoque;
    @Column(name = "FLAGESTORNADOESTOQUE", length = 1)
    private String flagestornadoestoque;
    @Column(name = "FLAGMOVIMENTAESTOQUE", length = 1)
    private String flagmovimentaestoque;
    @Column(name = "CODIGOVENDAESTOQUE")
    private Integer codigovendaestoque;
    @Column(name = "STATUSITEMESTOQUE")
    private Integer statusitemestoque;
    @JoinColumn(name = "IDPRODUTOESTOQUE", referencedColumnName = "IDPRODUTO")
    @ManyToOne
    private Produto idprodutoestoque;
    @JoinColumn(name = "IDITEMENTRADAESTOQUE", referencedColumnName = "IDITEMENTRADA")
    @ManyToOne
    private Itementrada iditementradaestoque;
    @JoinColumn(name = "IDITEMVENDAESTOQUE", referencedColumnName = "IDITEMVENDA")
    @ManyToOne
    private Itemvenda iditemvendaestoque;

    public Estoque() {
    }

    public Estoque(EstoquePK estoquePK) {
        this.estoquePK = estoquePK;
    }

    public Estoque(int idestoque, String tipooperacaoestoque, int codigoentradaestoque) {
        this.estoquePK = new EstoquePK(idestoque, tipooperacaoestoque, codigoentradaestoque);
    }

    public EstoquePK getEstoquePK() {
        return estoquePK;
    }

    public void setEstoquePK(EstoquePK estoquePK) {
        this.estoquePK = estoquePK;
    }

    public Date getDatamovimentoestoque() {
        return datamovimentoestoque;
    }

    public void setDatamovimentoestoque(Date datamovimentoestoque) {
        this.datamovimentoestoque = datamovimentoestoque;
    }

    public Integer getDocumentoestoque() {
        return documentoestoque;
    }

    public void setDocumentoestoque(Integer documentoestoque) {
        this.documentoestoque = documentoestoque;
    }

    public String getUnidademedidaestoque() {
        return unidademedidaestoque;
    }

    public void setUnidademedidaestoque(String unidademedidaestoque) {
        this.unidademedidaestoque = unidademedidaestoque;
    }

    public BigDecimal getQuantidadeestoque() {
        return quantidadeestoque;
    }

    public void setQuantidadeestoque(BigDecimal quantidadeestoque) {
        this.quantidadeestoque = quantidadeestoque;
    }

    public BigDecimal getQtdeentradaestoque() {
        return qtdeentradaestoque;
    }

    public void setQtdeentradaestoque(BigDecimal qtdeentradaestoque) {
        this.qtdeentradaestoque = qtdeentradaestoque;
    }

    public BigDecimal getQtdesaidaestoque() {
        return qtdesaidaestoque;
    }

    public void setQtdesaidaestoque(BigDecimal qtdesaidaestoque) {
        this.qtdesaidaestoque = qtdesaidaestoque;
    }

    public BigDecimal getValorcustoestoque() {
        return valorcustoestoque;
    }

    public void setValorcustoestoque(BigDecimal valorcustoestoque) {
        this.valorcustoestoque = valorcustoestoque;
    }

    public BigDecimal getValorvendaestoque() {
        return valorvendaestoque;
    }

    public void setValorvendaestoque(BigDecimal valorvendaestoque) {
        this.valorvendaestoque = valorvendaestoque;
    }

    public String getFlagestornadoestoque() {
        return flagestornadoestoque;
    }

    public void setFlagestornadoestoque(String flagestornadoestoque) {
        this.flagestornadoestoque = flagestornadoestoque;
    }

    public String getFlagmovimentaestoque() {
        return flagmovimentaestoque;
    }

    public void setFlagmovimentaestoque(String flagmovimentaestoque) {
        this.flagmovimentaestoque = flagmovimentaestoque;
    }

    public Integer getCodigovendaestoque() {
        return codigovendaestoque;
    }

    public void setCodigovendaestoque(Integer codigovendaestoque) {
        this.codigovendaestoque = codigovendaestoque;
    }

    public Integer getStatusitemestoque() {
        return statusitemestoque;
    }

    public void setStatusitemestoque(Integer statusitemestoque) {
        this.statusitemestoque = statusitemestoque;
    }

    public Produto getIdprodutoestoque() {
        return idprodutoestoque;
    }

    public void setIdprodutoestoque(Produto idprodutoestoque) {
        this.idprodutoestoque = idprodutoestoque;
    }

    public Itementrada getIditementradaestoque() {
        return iditementradaestoque;
    }

    public void setIditementradaestoque(Itementrada iditementradaestoque) {
        this.iditementradaestoque = iditementradaestoque;
    }

    public Itemvenda getIditemvendaestoque() {
        return iditemvendaestoque;
    }

    public void setIditemvendaestoque(Itemvenda iditemvendaestoque) {
        this.iditemvendaestoque = iditemvendaestoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estoquePK != null ? estoquePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.estoquePK == null && other.estoquePK != null) || (this.estoquePK != null && !this.estoquePK.equals(other.estoquePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Estoque[estoquePK=" + estoquePK + "]";
    }

}
