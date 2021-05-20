package com.lyh.entity;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * easybuy_product_category
 * @author 
 */
public class EasybuyProductCategory implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    @Transient
    private List<EasybuyProductCategory> list;
    @Transient
    private List<EasybuyProduct> product;

    /**
     * 父级目录id
     */
    private Integer parentid;

    /**
     * 级别(1:一级 2：二级 3：三级)
     */
    private Integer type;

    /**
     * 图标
     */
    private String iconclass;

    private static final long serialVersionUID = 1L;


    public List<EasybuyProduct> getProduct() {
        return product;
    }

    public void setProduct(List<EasybuyProduct> product) {
        this.product = product;
    }

    public List<EasybuyProductCategory> getList() {
        return list;
    }

    public void setList(List<EasybuyProductCategory> list) {
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EasybuyProductCategory other = (EasybuyProductCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIconclass() == null ? other.getIconclass() == null : this.getIconclass().equals(other.getIconclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIconclass() == null) ? 0 : getIconclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", type=").append(type);
        sb.append(", iconclass=").append(iconclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}