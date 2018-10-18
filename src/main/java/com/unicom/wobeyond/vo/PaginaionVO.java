package com.unicom.wobeyond.vo;

import java.util.List;

/**
* @ClassName: PaginaionVO
* @Description: TODO(分页的通用输出)
* @param <T>
*/
public class PaginaionVO <T> extends BaseRespVO{
	
	private static final long serialVersionUID = 1L;
	// 页容量
	private int pageSize;
	// 当前页
	private int currPage;
	// 总行数
	private long total;
	// 总页数
	private int totalPage;
	//行记录
	private List<T> rows;
	//底部记录
	private List<T> footer;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	
	public List<T> getFooter() {
        return footer;
    }

    public void setFooter(List<T> footer) {
        this.footer = footer;
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
