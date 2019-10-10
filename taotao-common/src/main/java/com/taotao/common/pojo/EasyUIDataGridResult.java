package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * datagrid展示数据的pojo 包括商品的Pojo
 */
public class EasyUIDataGridResult<T> implements Serializable {
    private Long total;
    private List<T> rows;
    @Override
    public String toString() {
        return "EasyUIDataGridResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }



}
