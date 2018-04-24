package entity;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {
    private Long total;//总记录数
    private List rows;//分组后数据

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
