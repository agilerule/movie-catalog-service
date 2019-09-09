package io.agilerules.moviecatalogservice.models;

public class CatalogItem {
    private String name;
    private String desc;
    private int rating;
    private String containerMetaDataServiceInfo;

    public CatalogItem(String name, String desc, int rating,  String containerMetaDataServiceInfo) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.containerMetaDataServiceInfo = containerMetaDataServiceInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

	public String getContainerMetaDataServiceInfo() {
		return containerMetaDataServiceInfo;
	}

	public void setContainerMetaDataServiceInfo(String containerMetaDataServiceInfo) {
		this.containerMetaDataServiceInfo = containerMetaDataServiceInfo;
	}
    
}
