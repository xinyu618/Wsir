package com.example.wuxinyu.myapplication;

import java.util.List;

/**
 * Created by wuxinyu on 2018/4/13.
 */

public class ImageModel {


    /**
     * lifeTrackHead :
     * pageType : 0
     * setNumber : 0
     * IsAvatarQuery : 0
     * avatarCategory :
     * tagZero :
     * tagOne :
     * tagTwo :
     * tagFatherSelected :
     * tagSelected :
     * tags : []
     * simgs : []
     * tag :
     * AVnum : 0
     * imgtotal : 1978
     * displayNum :
     * gsm : 4
     * listNum : 1978
     * headPic : {"status":"","query":"","desc":"","sign":"","obj_url":"","from_url":"","url":"","summary":"","pageNum":"-1","tagTwo":"","thumbURL":"","width":"","height":""}
     * imgs : [{"thumbURL":"http://img4.imgtn.bdimg.com/it/u=1436948145,4270509323&fm=200&gp=0.jpg","middleURL":"http://img4.imgtn.bdimg.com/it/u=1436948145,4270509323&fm=200&gp=0.jpg","largeTnImageUrl":"","hasLarge":true,"hoverURL":"","pageNum":2,"objURL":"http://imgsrc.baidu.com/imgad/pic/item/0df431adcbef7609c64a714b24dda3cc7dd99ea5.jpg","fromURL":"http://www.tukuchina.cn/r/photo/view/id/235562905615/","fromURLHost":"www.tukuchina.cn","currentIndex":"","width":1200,"height":791,"type":"jpg","filesize":"","bdSrcType":"13","di":"10625047640","is":"0,0","bdSetImgNum":0,"bdImgnewsDate":"1970-01-01 08:00","fromPageTitle":"椋庢櫙","bdSourceName":"","bdFromPageTitlePrefix":"","isAspDianjing":false,"token":"","source_type":"","tagTwo":"","cs":"1436948145,4270509323","os":"3251246861,2225287580","simid":"0,0","pi":"0","adType":"0","setDowloadURL":"","setTittle":"","DecorateCompanyName":"","DecorateCompanyLocation":"","DecorateWantuUrl":"","DecorateCompanyId":"","DecorateCompanyGrade":"","personalized":"0"},{"thumbURL":"http://img4.imgtn.bdimg.com/it/u=1943249770,628140654&fm=200&gp=0.jpg","middleURL":"http://img4.imgtn.bdimg.com/it/u=1943249770,628140654&fm=200&gp=0.jpg","largeTnImageUrl":"","hasLarge":true,"hoverURL":"","pageNum":3,"objURL":"http://imgsrc.baidu.com/imgad/pic/item/3801213fb80e7beca9004ec5252eb9389b506b38.jpg","fromURL":"http://www.quanjing.com/imgbuy/ul0798-4504.html","fromURLHost":"www.quanjing.com","currentIndex":"","width":1000,"height":667,"type":"jpg","filesize":"","bdSrcType":"13","di":"48022652940","is":"0,0","bdSetImgNum":0,"bdImgnewsDate":"1970-01-01 08:00","fromPageTitle":"婕備寒,椋庢櫙","bdSourceName":"","bdFromPageTitlePrefix":"","isAspDianjing":false,"token":"","source_type":"","tagTwo":"","cs":"1943249770,628140654","os":"212069589,2614216017","simid":"0,0","pi":"0","adType":"0","setDowloadURL":"","setTittle":"","DecorateCompanyName":"","DecorateCompanyLocation":"","DecorateWantuUrl":"","DecorateCompanyId":"","DecorateCompanyGrade":"","personalized":"0"}]
     */

    private String lifeTrackHead;
    private String pageType;
    private int setNumber;
    private String IsAvatarQuery;
    private String avatarCategory;
    private String tagZero;
    private String tagOne;
    private String tagTwo;
    private String tagFatherSelected;
    private String tagSelected;
    private String tag;
    private String AVnum;
    private String imgtotal;
    private String displayNum;
    private String gsm;
    private String listNum;
    private HeadPicBean headPic;
    private List<?> tags;
    private List<?> simgs;
    private List<ImgsBean> imgs;

    public String getLifeTrackHead() {
        return lifeTrackHead;
    }

    public void setLifeTrackHead(String lifeTrackHead) {
        this.lifeTrackHead = lifeTrackHead;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    public String getIsAvatarQuery() {
        return IsAvatarQuery;
    }

    public void setIsAvatarQuery(String IsAvatarQuery) {
        this.IsAvatarQuery = IsAvatarQuery;
    }

    public String getAvatarCategory() {
        return avatarCategory;
    }

    public void setAvatarCategory(String avatarCategory) {
        this.avatarCategory = avatarCategory;
    }

    public String getTagZero() {
        return tagZero;
    }

    public void setTagZero(String tagZero) {
        this.tagZero = tagZero;
    }

    public String getTagOne() {
        return tagOne;
    }

    public void setTagOne(String tagOne) {
        this.tagOne = tagOne;
    }

    public String getTagTwo() {
        return tagTwo;
    }

    public void setTagTwo(String tagTwo) {
        this.tagTwo = tagTwo;
    }

    public String getTagFatherSelected() {
        return tagFatherSelected;
    }

    public void setTagFatherSelected(String tagFatherSelected) {
        this.tagFatherSelected = tagFatherSelected;
    }

    public String getTagSelected() {
        return tagSelected;
    }

    public void setTagSelected(String tagSelected) {
        this.tagSelected = tagSelected;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAVnum() {
        return AVnum;
    }

    public void setAVnum(String AVnum) {
        this.AVnum = AVnum;
    }

    public String getImgtotal() {
        return imgtotal;
    }

    public void setImgtotal(String imgtotal) {
        this.imgtotal = imgtotal;
    }

    public String getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(String displayNum) {
        this.displayNum = displayNum;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getListNum() {
        return listNum;
    }

    public void setListNum(String listNum) {
        this.listNum = listNum;
    }

    public HeadPicBean getHeadPic() {
        return headPic;
    }

    public void setHeadPic(HeadPicBean headPic) {
        this.headPic = headPic;
    }

    public List<?> getTags() {
        return tags;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }

    public List<?> getSimgs() {
        return simgs;
    }

    public void setSimgs(List<?> simgs) {
        this.simgs = simgs;
    }

    public List<ImgsBean> getImgs() {
        return imgs;
    }

    public void setImgs(List<ImgsBean> imgs) {
        this.imgs = imgs;
    }

    public static class HeadPicBean {
        /**
         * status :
         * query :
         * desc :
         * sign :
         * obj_url :
         * from_url :
         * url :
         * summary :
         * pageNum : -1
         * tagTwo :
         * thumbURL :
         * width :
         * height :
         */

        private String status;
        private String query;
        private String desc;
        private String sign;
        private String obj_url;
        private String from_url;
        private String url;
        private String summary;
        private String pageNum;
        private String tagTwo;
        private String thumbURL;
        private String width;
        private String height;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getObj_url() {
            return obj_url;
        }

        public void setObj_url(String obj_url) {
            this.obj_url = obj_url;
        }

        public String getFrom_url() {
            return from_url;
        }

        public void setFrom_url(String from_url) {
            this.from_url = from_url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getPageNum() {
            return pageNum;
        }

        public void setPageNum(String pageNum) {
            this.pageNum = pageNum;
        }

        public String getTagTwo() {
            return tagTwo;
        }

        public void setTagTwo(String tagTwo) {
            this.tagTwo = tagTwo;
        }

        public String getThumbURL() {
            return thumbURL;
        }

        public void setThumbURL(String thumbURL) {
            this.thumbURL = thumbURL;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public static class ImgsBean {
        /**
         * thumbURL : http://img4.imgtn.bdimg.com/it/u=1436948145,4270509323&fm=200&gp=0.jpg
         * middleURL : http://img4.imgtn.bdimg.com/it/u=1436948145,4270509323&fm=200&gp=0.jpg
         * largeTnImageUrl :
         * hasLarge : true
         * hoverURL :
         * pageNum : 2
         * objURL : http://imgsrc.baidu.com/imgad/pic/item/0df431adcbef7609c64a714b24dda3cc7dd99ea5.jpg
         * fromURL : http://www.tukuchina.cn/r/photo/view/id/235562905615/
         * fromURLHost : www.tukuchina.cn
         * currentIndex :
         * width : 1200
         * height : 791
         * type : jpg
         * filesize :
         * bdSrcType : 13
         * di : 10625047640
         * is : 0,0
         * bdSetImgNum : 0
         * bdImgnewsDate : 1970-01-01 08:00
         * fromPageTitle : 椋庢櫙
         * bdSourceName :
         * bdFromPageTitlePrefix :
         * isAspDianjing : false
         * token :
         * source_type :
         * tagTwo :
         * cs : 1436948145,4270509323
         * os : 3251246861,2225287580
         * simid : 0,0
         * pi : 0
         * adType : 0
         * setDowloadURL :
         * setTittle :
         * DecorateCompanyName :
         * DecorateCompanyLocation :
         * DecorateWantuUrl :
         * DecorateCompanyId :
         * DecorateCompanyGrade :
         * personalized : 0
         */

        private String thumbURL;
        private String middleURL;
        private String largeTnImageUrl;
        private boolean hasLarge;
        private String hoverURL;
        private int pageNum;
        private String objURL;
        private String fromURL;
        private String fromURLHost;
        private String currentIndex;
        private int width;
        private int height;
        private String type;
        private String filesize;
        private String bdSrcType;
        private String di;
        private String is;
        private int bdSetImgNum;
        private String bdImgnewsDate;
        private String fromPageTitle;
        private String bdSourceName;
        private String bdFromPageTitlePrefix;
        private boolean isAspDianjing;
        private String token;
        private String source_type;
        private String tagTwo;
        private String cs;
        private String os;
        private String simid;
        private String pi;
        private String adType;
        private String setDowloadURL;
        private String setTittle;
        private String DecorateCompanyName;
        private String DecorateCompanyLocation;
        private String DecorateWantuUrl;
        private String DecorateCompanyId;
        private String DecorateCompanyGrade;
        private String personalized;

        public String getThumbURL() {
            return thumbURL;
        }

        public void setThumbURL(String thumbURL) {
            this.thumbURL = thumbURL;
        }

        public String getMiddleURL() {
            return middleURL;
        }

        public void setMiddleURL(String middleURL) {
            this.middleURL = middleURL;
        }

        public String getLargeTnImageUrl() {
            return largeTnImageUrl;
        }

        public void setLargeTnImageUrl(String largeTnImageUrl) {
            this.largeTnImageUrl = largeTnImageUrl;
        }

        public boolean isHasLarge() {
            return hasLarge;
        }

        public void setHasLarge(boolean hasLarge) {
            this.hasLarge = hasLarge;
        }

        public String getHoverURL() {
            return hoverURL;
        }

        public void setHoverURL(String hoverURL) {
            this.hoverURL = hoverURL;
        }

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public String getObjURL() {
            return objURL;
        }

        public void setObjURL(String objURL) {
            this.objURL = objURL;
        }

        public String getFromURL() {
            return fromURL;
        }

        public void setFromURL(String fromURL) {
            this.fromURL = fromURL;
        }

        public String getFromURLHost() {
            return fromURLHost;
        }

        public void setFromURLHost(String fromURLHost) {
            this.fromURLHost = fromURLHost;
        }

        public String getCurrentIndex() {
            return currentIndex;
        }

        public void setCurrentIndex(String currentIndex) {
            this.currentIndex = currentIndex;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFilesize() {
            return filesize;
        }

        public void setFilesize(String filesize) {
            this.filesize = filesize;
        }

        public String getBdSrcType() {
            return bdSrcType;
        }

        public void setBdSrcType(String bdSrcType) {
            this.bdSrcType = bdSrcType;
        }

        public String getDi() {
            return di;
        }

        public void setDi(String di) {
            this.di = di;
        }

        public String getIs() {
            return is;
        }

        public void setIs(String is) {
            this.is = is;
        }

        public int getBdSetImgNum() {
            return bdSetImgNum;
        }

        public void setBdSetImgNum(int bdSetImgNum) {
            this.bdSetImgNum = bdSetImgNum;
        }

        public String getBdImgnewsDate() {
            return bdImgnewsDate;
        }

        public void setBdImgnewsDate(String bdImgnewsDate) {
            this.bdImgnewsDate = bdImgnewsDate;
        }

        public String getFromPageTitle() {
            return fromPageTitle;
        }

        public void setFromPageTitle(String fromPageTitle) {
            this.fromPageTitle = fromPageTitle;
        }

        public String getBdSourceName() {
            return bdSourceName;
        }

        public void setBdSourceName(String bdSourceName) {
            this.bdSourceName = bdSourceName;
        }

        public String getBdFromPageTitlePrefix() {
            return bdFromPageTitlePrefix;
        }

        public void setBdFromPageTitlePrefix(String bdFromPageTitlePrefix) {
            this.bdFromPageTitlePrefix = bdFromPageTitlePrefix;
        }

        public boolean isIsAspDianjing() {
            return isAspDianjing;
        }

        public void setIsAspDianjing(boolean isAspDianjing) {
            this.isAspDianjing = isAspDianjing;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getSource_type() {
            return source_type;
        }

        public void setSource_type(String source_type) {
            this.source_type = source_type;
        }

        public String getTagTwo() {
            return tagTwo;
        }

        public void setTagTwo(String tagTwo) {
            this.tagTwo = tagTwo;
        }

        public String getCs() {
            return cs;
        }

        public void setCs(String cs) {
            this.cs = cs;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getSimid() {
            return simid;
        }

        public void setSimid(String simid) {
            this.simid = simid;
        }

        public String getPi() {
            return pi;
        }

        public void setPi(String pi) {
            this.pi = pi;
        }

        public String getAdType() {
            return adType;
        }

        public void setAdType(String adType) {
            this.adType = adType;
        }

        public String getSetDowloadURL() {
            return setDowloadURL;
        }

        public void setSetDowloadURL(String setDowloadURL) {
            this.setDowloadURL = setDowloadURL;
        }

        public String getSetTittle() {
            return setTittle;
        }

        public void setSetTittle(String setTittle) {
            this.setTittle = setTittle;
        }

        public String getDecorateCompanyName() {
            return DecorateCompanyName;
        }

        public void setDecorateCompanyName(String DecorateCompanyName) {
            this.DecorateCompanyName = DecorateCompanyName;
        }

        public String getDecorateCompanyLocation() {
            return DecorateCompanyLocation;
        }

        public void setDecorateCompanyLocation(String DecorateCompanyLocation) {
            this.DecorateCompanyLocation = DecorateCompanyLocation;
        }

        public String getDecorateWantuUrl() {
            return DecorateWantuUrl;
        }

        public void setDecorateWantuUrl(String DecorateWantuUrl) {
            this.DecorateWantuUrl = DecorateWantuUrl;
        }

        public String getDecorateCompanyId() {
            return DecorateCompanyId;
        }

        public void setDecorateCompanyId(String DecorateCompanyId) {
            this.DecorateCompanyId = DecorateCompanyId;
        }

        public String getDecorateCompanyGrade() {
            return DecorateCompanyGrade;
        }

        public void setDecorateCompanyGrade(String DecorateCompanyGrade) {
            this.DecorateCompanyGrade = DecorateCompanyGrade;
        }

        public String getPersonalized() {
            return personalized;
        }

        public void setPersonalized(String personalized) {
            this.personalized = personalized;
        }
    }
}
