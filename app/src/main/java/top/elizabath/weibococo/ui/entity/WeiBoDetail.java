package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class WeiBoDetail {
    /**
     * ok : 1
     * data : {"created_at":"Mon Jun 24 15:35:56 +0800 2019","id":"4386731509545047","mid":"4386731509545047","can_edit":false,"show_additional_indication":0,"text":"【38岁<a  href=\"https://m.weibo.cn/search?containerid=231522type%3D1%26t%3D10%26q%3D%23%E5%A6%88%E5%A6%88%E9%99%AA%E5%84%BF%E5%AD%90%E9%AB%98%E8%80%83%E8%BF%87%E4%BA%8C%E6%9C%AC%E7%BA%BF%23&extparam=%23%E5%A6%88%E5%A6%88%E9%99%AA%E5%84%BF%E5%AD%90%E9%AB%98%E8%80%83%E8%BF%87%E4%BA%8C%E6%9C%AC%E7%BA%BF%23\" data-hide=\"\"><span class=\"surl-text\">#妈妈陪儿子高考过二本线#<\/span><\/a>86分：语文、英语均超120，数学20】广西玉林38岁的莫莉陪儿子参加高考，取得474分的成绩，超文科二本分数线86分，其中语文和英语均超120分。她说参加高考是自己的愿望，曾计划在50岁时报考，但觉得跟儿子一起高考比较有意义，想感受孩子的压力，所以就提前了。<a data-url=\"http://t.cn/AipJkX69\" href=\"https://www.miaopai.com/show/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.htm\" data-hide=\"\"><span class='url-icon'><img style='width: 1rem;height: 1rem' src='https://h5.sinaimg.cn/upload/2015/09/25/3/timeline_card_small_video_default.png'><\/span><span class=\"surl-text\">一手video的秒拍视频<\/span><\/a>","textLength":291,"source":"微博 weibo.com","favorited":false,"pic_ids":[],"pic_types":"","is_paid":false,"mblog_vip_type":0,"user":{"id":1323527941,"screen_name":"Vista看天下","profile_image_url":"https://tva2.sinaimg.cn/crop.0.0.180.180.180/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg","profile_url":"https://m.weibo.cn/u/1323527941?uid=1323527941","statuses_count":69131,"verified":true,"verified_type":3,"verified_type_ext":0,"verified_reason":"《Vista看天下》官方微博","close_blue_v":false,"description":"一个有趣的蓝V","gender":"m","mbtype":12,"urank":48,"mbrank":6,"follow_me":false,"following":false,"followers_count":17443261,"follow_count":1783,"cover_image_phone":"https://tva1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg","avatar_hd":"https://ww2.sinaimg.cn/orj480/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg","like":false,"like_me":false,"badge":{"enterprise":1,"gongyi_level":1,"bind_taobao":1,"dzwbqlx_2016":1,"follow_whitelist_video":1,"lol_gm_2017":1,"user_name_certificate":1,"wenchuan_10th":1,"qixi_2018":1,"lol_s8":1,"memorial_2018":1,"denglong_2019":1,"suishoupai_2019":1}},"reposts_count":155,"comments_count":517,"attitudes_count":1147,"pending_approval_count":0,"isLongText":true,"hide_multi_attitude":1,"reward_exhibition_type":0,"hide_flag":1,"visible":{"type":0,"list_id":0},"darwin_tags":[],"mblogtype":0,"more_info_type":0,"cardid":"star_583","content_auth":0,"page_info":{"type":"video","object_type":11,"page_pic":{"width":640,"url":"https://imgaliyuncdn.miaopai.com/images/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw___l9od_4.jpg","height":360},"page_url":"https://weibo.cn/sinaurl/blocked34bc68bf?u=http%3A%2F%2Fmiaopai.com%2Fshow%2F-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.htm","object_id":"2017607:4386487115130614","page_title":"一手video的秒拍视频","title":"38岁妈妈陪儿子一起高考,英语126分","content1":"一手video的秒拍视频","content2":"38岁妈妈陪儿子一起高考,英语126分 via@一手video","video_orientation":"horizontal","play_count":"651万","media_info":{"stream_url":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_ld&mpflag=16&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","stream_url_hd":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_hd&mpflag=8&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","duration":89},"urls":null,"video_details":{"size":3681280,"bitrate":330,"label":"mp4_720p"}},"bid":"HAohwE36n","buttons":[{"type":"follow","name":"关注","sub_type":0,"params":{"uid":1323527941}}],"status_title":"38岁#妈妈陪儿子高考过二本线#86分：语文、英语均超120，数学20","ok":1}
     */

    private String ok;
    private DataBean data;

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * created_at : Mon Jun 24 15:35:56 +0800 2019
         * id : 4386731509545047
         * mid : 4386731509545047
         * can_edit : false
         * show_additional_indication : 0
         * text : 【38岁<a  href="https://m.weibo.cn/search?containerid=231522type%3D1%26t%3D10%26q%3D%23%E5%A6%88%E5%A6%88%E9%99%AA%E5%84%BF%E5%AD%90%E9%AB%98%E8%80%83%E8%BF%87%E4%BA%8C%E6%9C%AC%E7%BA%BF%23&extparam=%23%E5%A6%88%E5%A6%88%E9%99%AA%E5%84%BF%E5%AD%90%E9%AB%98%E8%80%83%E8%BF%87%E4%BA%8C%E6%9C%AC%E7%BA%BF%23" data-hide=""><span class="surl-text">#妈妈陪儿子高考过二本线#</span></a>86分：语文、英语均超120，数学20】广西玉林38岁的莫莉陪儿子参加高考，取得474分的成绩，超文科二本分数线86分，其中语文和英语均超120分。她说参加高考是自己的愿望，曾计划在50岁时报考，但觉得跟儿子一起高考比较有意义，想感受孩子的压力，所以就提前了。<a data-url="http://t.cn/AipJkX69" href="https://www.miaopai.com/show/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.htm" data-hide=""><span class='url-icon'><img style='width: 1rem;height: 1rem' src='https://h5.sinaimg.cn/upload/2015/09/25/3/timeline_card_small_video_default.png'></span><span class="surl-text">一手video的秒拍视频</span></a>
         * textLength : 291
         * source : 微博 weibo.com
         * favorited : false
         * pic_ids : []
         * pic_types :
         * is_paid : false
         * mblog_vip_type : 0
         * user : {"id":1323527941,"screen_name":"Vista看天下","profile_image_url":"https://tva2.sinaimg.cn/crop.0.0.180.180.180/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg","profile_url":"https://m.weibo.cn/u/1323527941?uid=1323527941","statuses_count":69131,"verified":true,"verified_type":3,"verified_type_ext":0,"verified_reason":"《Vista看天下》官方微博","close_blue_v":false,"description":"一个有趣的蓝V","gender":"m","mbtype":12,"urank":48,"mbrank":6,"follow_me":false,"following":false,"followers_count":17443261,"follow_count":1783,"cover_image_phone":"https://tva1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg","avatar_hd":"https://ww2.sinaimg.cn/orj480/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg","like":false,"like_me":false,"badge":{"enterprise":1,"gongyi_level":1,"bind_taobao":1,"dzwbqlx_2016":1,"follow_whitelist_video":1,"lol_gm_2017":1,"user_name_certificate":1,"wenchuan_10th":1,"qixi_2018":1,"lol_s8":1,"memorial_2018":1,"denglong_2019":1,"suishoupai_2019":1}}
         * reposts_count : 155
         * comments_count : 517
         * attitudes_count : 1147
         * pending_approval_count : 0
         * isLongText : true
         * hide_multi_attitude : 1
         * reward_exhibition_type : 0
         * hide_flag : 1
         * visible : {"type":0,"list_id":0}
         * darwin_tags : []
         * mblogtype : 0
         * more_info_type : 0
         * cardid : star_583
         * content_auth : 0
         * page_info : {"type":"video","object_type":11,"page_pic":{"width":640,"url":"https://imgaliyuncdn.miaopai.com/images/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw___l9od_4.jpg","height":360},"page_url":"https://weibo.cn/sinaurl/blocked34bc68bf?u=http%3A%2F%2Fmiaopai.com%2Fshow%2F-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.htm","object_id":"2017607:4386487115130614","page_title":"一手video的秒拍视频","title":"38岁妈妈陪儿子一起高考,英语126分","content1":"一手video的秒拍视频","content2":"38岁妈妈陪儿子一起高考,英语126分 via@一手video","video_orientation":"horizontal","play_count":"651万","media_info":{"stream_url":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_ld&mpflag=16&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","stream_url_hd":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_hd&mpflag=8&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","duration":89},"urls":null,"video_details":{"size":3681280,"bitrate":330,"label":"mp4_720p"}}
         * bid : HAohwE36n
         * buttons : [{"type":"follow","name":"关注","sub_type":0,"params":{"uid":1323527941}}]
         * status_title : 38岁#妈妈陪儿子高考过二本线#86分：语文、英语均超120，数学20
         * ok : 1
         */

        private String created_at;
        private String id;
        private String mid;
        private boolean can_edit;
        private String show_additional_indication;
        private String text;
        private String textLength;
        private String source;
        private boolean favorited;
        private String pic_types;
        private boolean is_paid;
        private String mblog_vip_type;
        private UserBean user;
        private String reposts_count;
        private String comments_count;
        private String attitudes_count;
        private String pending_approval_count;
        private boolean isLongText;
        private String hide_multi_attitude;
        private String reward_exhibition_type;
        private String hide_flag;
        private VisibleBean visible;
        private String mblogtype;
        private String more_info_type;
        private String cardid;
        private String content_auth;
        private PageInfoBean page_info;
        private String bid;
        private String status_title;
        private String ok;
        private List<?> pic_ids;
        private List<?> darwin_tags;
        private List<ButtonsBean> buttons;

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public boolean isCan_edit() {
            return can_edit;
        }

        public void setCan_edit(boolean can_edit) {
            this.can_edit = can_edit;
        }

        public String getShow_additional_indication() {
            return show_additional_indication;
        }

        public void setShow_additional_indication(String show_additional_indication) {
            this.show_additional_indication = show_additional_indication;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getTextLength() {
            return textLength;
        }

        public void setTextLength(String textLength) {
            this.textLength = textLength;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public boolean isFavorited() {
            return favorited;
        }

        public void setFavorited(boolean favorited) {
            this.favorited = favorited;
        }

        public String getPic_types() {
            return pic_types;
        }

        public void setPic_types(String pic_types) {
            this.pic_types = pic_types;
        }

        public boolean isIs_paid() {
            return is_paid;
        }

        public void setIs_paid(boolean is_paid) {
            this.is_paid = is_paid;
        }

        public String getMblog_vip_type() {
            return mblog_vip_type;
        }

        public void setMblog_vip_type(String mblog_vip_type) {
            this.mblog_vip_type = mblog_vip_type;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getReposts_count() {
            return reposts_count;
        }

        public void setReposts_count(String reposts_count) {
            this.reposts_count = reposts_count;
        }

        public String getComments_count() {
            return comments_count;
        }

        public void setComments_count(String comments_count) {
            this.comments_count = comments_count;
        }

        public String getAttitudes_count() {
            return attitudes_count;
        }

        public void setAttitudes_count(String attitudes_count) {
            this.attitudes_count = attitudes_count;
        }

        public String getPending_approval_count() {
            return pending_approval_count;
        }

        public void setPending_approval_count(String pending_approval_count) {
            this.pending_approval_count = pending_approval_count;
        }

        public boolean isIsLongText() {
            return isLongText;
        }

        public void setIsLongText(boolean isLongText) {
            this.isLongText = isLongText;
        }

        public String getHide_multi_attitude() {
            return hide_multi_attitude;
        }

        public void setHide_multi_attitude(String hide_multi_attitude) {
            this.hide_multi_attitude = hide_multi_attitude;
        }

        public String getReward_exhibition_type() {
            return reward_exhibition_type;
        }

        public void setReward_exhibition_type(String reward_exhibition_type) {
            this.reward_exhibition_type = reward_exhibition_type;
        }

        public String getHide_flag() {
            return hide_flag;
        }

        public void setHide_flag(String hide_flag) {
            this.hide_flag = hide_flag;
        }

        public VisibleBean getVisible() {
            return visible;
        }

        public void setVisible(VisibleBean visible) {
            this.visible = visible;
        }

        public String getMblogtype() {
            return mblogtype;
        }

        public void setMblogtype(String mblogtype) {
            this.mblogtype = mblogtype;
        }

        public String getMore_info_type() {
            return more_info_type;
        }

        public void setMore_info_type(String more_info_type) {
            this.more_info_type = more_info_type;
        }

        public String getCardid() {
            return cardid;
        }

        public void setCardid(String cardid) {
            this.cardid = cardid;
        }

        public String getContent_auth() {
            return content_auth;
        }

        public void setContent_auth(String content_auth) {
            this.content_auth = content_auth;
        }

        public PageInfoBean getPage_info() {
            return page_info;
        }

        public void setPage_info(PageInfoBean page_info) {
            this.page_info = page_info;
        }

        public String getBid() {
            return bid;
        }

        public void setBid(String bid) {
            this.bid = bid;
        }

        public String getStatus_title() {
            return status_title;
        }

        public void setStatus_title(String status_title) {
            this.status_title = status_title;
        }

        public String getOk() {
            return ok;
        }

        public void setOk(String ok) {
            this.ok = ok;
        }

        public List<?> getPic_ids() {
            return pic_ids;
        }

        public void setPic_ids(List<?> pic_ids) {
            this.pic_ids = pic_ids;
        }

        public List<?> getDarwin_tags() {
            return darwin_tags;
        }

        public void setDarwin_tags(List<?> darwin_tags) {
            this.darwin_tags = darwin_tags;
        }

        public List<ButtonsBean> getButtons() {
            return buttons;
        }

        public void setButtons(List<ButtonsBean> buttons) {
            this.buttons = buttons;
        }

        public static class UserBean {
            /**
             * id : 1323527941
             * screen_name : Vista看天下
             * profile_image_url : https://tva2.sinaimg.cn/crop.0.0.180.180.180/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg
             * profile_url : https://m.weibo.cn/u/1323527941?uid=1323527941
             * statuses_count : 69131
             * verified : true
             * verified_type : 3
             * verified_type_ext : 0
             * verified_reason : 《Vista看天下》官方微博
             * close_blue_v : false
             * description : 一个有趣的蓝V
             * gender : m
             * mbtype : 12
             * urank : 48
             * mbrank : 6
             * follow_me : false
             * following : false
             * followers_count : 17443261
             * follow_count : 1783
             * cover_image_phone : https://tva1.sinaimg.cn/crop.0.0.640.640.640/549d0121tw1egm1kjly3jj20hs0hsq4f.jpg
             * avatar_hd : https://ww2.sinaimg.cn/orj480/4ee36f05jw1e8qgp5bmzyj2050050aa8.jpg
             * like : false
             * like_me : false
             * badge : {"enterprise":1,"gongyi_level":1,"bind_taobao":1,"dzwbqlx_2016":1,"follow_whitelist_video":1,"lol_gm_2017":1,"user_name_certificate":1,"wenchuan_10th":1,"qixi_2018":1,"lol_s8":1,"memorial_2018":1,"denglong_2019":1,"suishoupai_2019":1}
             */

            private String id;
            private String screen_name;
            private String profile_image_url;
            private String profile_url;
            private String statuses_count;
            private boolean verified;
            private String verified_type;
            private String verified_type_ext;
            private String verified_reason;
            private boolean close_blue_v;
            private String description;
            private String gender;
            private String mbtype;
            private String urank;
            private String mbrank;
            private boolean follow_me;
            private boolean following;
            private String followers_count;
            private String follow_count;
            private String cover_image_phone;
            private String avatar_hd;
            private boolean like;
            private boolean like_me;
            private BadgeBean badge;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public String getProfile_image_url() {
                return profile_image_url;
            }

            public void setProfile_image_url(String profile_image_url) {
                this.profile_image_url = profile_image_url;
            }

            public String getProfile_url() {
                return profile_url;
            }

            public void setProfile_url(String profile_url) {
                this.profile_url = profile_url;
            }

            public String getStatuses_count() {
                return statuses_count;
            }

            public void setStatuses_count(String statuses_count) {
                this.statuses_count = statuses_count;
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public String getVerified_type() {
                return verified_type;
            }

            public void setVerified_type(String verified_type) {
                this.verified_type = verified_type;
            }

            public String getVerified_type_ext() {
                return verified_type_ext;
            }

            public void setVerified_type_ext(String verified_type_ext) {
                this.verified_type_ext = verified_type_ext;
            }

            public String getVerified_reason() {
                return verified_reason;
            }

            public void setVerified_reason(String verified_reason) {
                this.verified_reason = verified_reason;
            }

            public boolean isClose_blue_v() {
                return close_blue_v;
            }

            public void setClose_blue_v(boolean close_blue_v) {
                this.close_blue_v = close_blue_v;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getMbtype() {
                return mbtype;
            }

            public void setMbtype(String mbtype) {
                this.mbtype = mbtype;
            }

            public String getUrank() {
                return urank;
            }

            public void setUrank(String urank) {
                this.urank = urank;
            }

            public String getMbrank() {
                return mbrank;
            }

            public void setMbrank(String mbrank) {
                this.mbrank = mbrank;
            }

            public boolean isFollow_me() {
                return follow_me;
            }

            public void setFollow_me(boolean follow_me) {
                this.follow_me = follow_me;
            }

            public boolean isFollowing() {
                return following;
            }

            public void setFollowing(boolean following) {
                this.following = following;
            }

            public String getFollowers_count() {
                return followers_count;
            }

            public void setFollowers_count(String followers_count) {
                this.followers_count = followers_count;
            }

            public String getFollow_count() {
                return follow_count;
            }

            public void setFollow_count(String follow_count) {
                this.follow_count = follow_count;
            }

            public String getCover_image_phone() {
                return cover_image_phone;
            }

            public void setCover_image_phone(String cover_image_phone) {
                this.cover_image_phone = cover_image_phone;
            }

            public String getAvatar_hd() {
                return avatar_hd;
            }

            public void setAvatar_hd(String avatar_hd) {
                this.avatar_hd = avatar_hd;
            }

            public boolean isLike() {
                return like;
            }

            public void setLike(boolean like) {
                this.like = like;
            }

            public boolean isLike_me() {
                return like_me;
            }

            public void setLike_me(boolean like_me) {
                this.like_me = like_me;
            }

            public BadgeBean getBadge() {
                return badge;
            }

            public void setBadge(BadgeBean badge) {
                this.badge = badge;
            }

            public static class BadgeBean {
                /**
                 * enterprise : 1
                 * gongyi_level : 1
                 * bind_taobao : 1
                 * dzwbqlx_2016 : 1
                 * follow_whitelist_video : 1
                 * lol_gm_2017 : 1
                 * user_name_certificate : 1
                 * wenchuan_10th : 1
                 * qixi_2018 : 1
                 * lol_s8 : 1
                 * memorial_2018 : 1
                 * denglong_2019 : 1
                 * suishoupai_2019 : 1
                 */

                private String enterprise;
                private String gongyi_level;
                private String bind_taobao;
                private String dzwbqlx_2016;
                private String follow_whitelist_video;
                private String lol_gm_2017;
                private String user_name_certificate;
                private String wenchuan_10th;
                private String qixi_2018;
                private String lol_s8;
                private String memorial_2018;
                private String denglong_2019;
                private String suishoupai_2019;

                public String getEnterprise() {
                    return enterprise;
                }

                public void setEnterprise(String enterprise) {
                    this.enterprise = enterprise;
                }

                public String getGongyi_level() {
                    return gongyi_level;
                }

                public void setGongyi_level(String gongyi_level) {
                    this.gongyi_level = gongyi_level;
                }

                public String getBind_taobao() {
                    return bind_taobao;
                }

                public void setBind_taobao(String bind_taobao) {
                    this.bind_taobao = bind_taobao;
                }

                public String getDzwbqlx_2016() {
                    return dzwbqlx_2016;
                }

                public void setDzwbqlx_2016(String dzwbqlx_2016) {
                    this.dzwbqlx_2016 = dzwbqlx_2016;
                }

                public String getFollow_whitelist_video() {
                    return follow_whitelist_video;
                }

                public void setFollow_whitelist_video(String follow_whitelist_video) {
                    this.follow_whitelist_video = follow_whitelist_video;
                }

                public String getLol_gm_2017() {
                    return lol_gm_2017;
                }

                public void setLol_gm_2017(String lol_gm_2017) {
                    this.lol_gm_2017 = lol_gm_2017;
                }

                public String getUser_name_certificate() {
                    return user_name_certificate;
                }

                public void setUser_name_certificate(String user_name_certificate) {
                    this.user_name_certificate = user_name_certificate;
                }

                public String getWenchuan_10th() {
                    return wenchuan_10th;
                }

                public void setWenchuan_10th(String wenchuan_10th) {
                    this.wenchuan_10th = wenchuan_10th;
                }

                public String getQixi_2018() {
                    return qixi_2018;
                }

                public void setQixi_2018(String qixi_2018) {
                    this.qixi_2018 = qixi_2018;
                }

                public String getLol_s8() {
                    return lol_s8;
                }

                public void setLol_s8(String lol_s8) {
                    this.lol_s8 = lol_s8;
                }

                public String getMemorial_2018() {
                    return memorial_2018;
                }

                public void setMemorial_2018(String memorial_2018) {
                    this.memorial_2018 = memorial_2018;
                }

                public String getDenglong_2019() {
                    return denglong_2019;
                }

                public void setDenglong_2019(String denglong_2019) {
                    this.denglong_2019 = denglong_2019;
                }

                public String getSuishoupai_2019() {
                    return suishoupai_2019;
                }

                public void setSuishoupai_2019(String suishoupai_2019) {
                    this.suishoupai_2019 = suishoupai_2019;
                }
            }
        }

        public static class VisibleBean {
            /**
             * type : 0
             * list_id : 0
             */

            private String type;
            private String list_id;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getList_id() {
                return list_id;
            }

            public void setList_id(String list_id) {
                this.list_id = list_id;
            }
        }

        public static class PageInfoBean {
            /**
             * type : video
             * object_type : 11
             * page_pic : {"width":640,"url":"https://imgaliyuncdn.miaopai.com/images/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw___l9od_4.jpg","height":360}
             * page_url : https://weibo.cn/sinaurl/blocked34bc68bf?u=http%3A%2F%2Fmiaopai.com%2Fshow%2F-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.htm
             * object_id : 2017607:4386487115130614
             * page_title : 一手video的秒拍视频
             * title : 38岁妈妈陪儿子一起高考,英语126分
             * content1 : 一手video的秒拍视频
             * content2 : 38岁妈妈陪儿子一起高考,英语126分 via@一手video
             * video_orientation : horizontal
             * play_count : 651万
             * media_info : {"stream_url":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_ld&mpflag=16&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","stream_url_hd":"https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_hd&mpflag=8&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video","duration":89}
             * urls : null
             * video_details : {"size":3681280,"bitrate":330,"label":"mp4_720p"}
             */

            private String type;
            private String object_type;
            private PagePicBean page_pic;
            private String page_url;
            private String object_id;
            private String page_title;
            private String title;
            private String content1;
            private String content2;
            private String video_orientation;
            private String play_count;
            private MediaInfoBean media_info;
            private Object urls;
            private VideoDetailsBean video_details;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getObject_type() {
                return object_type;
            }

            public void setObject_type(String object_type) {
                this.object_type = object_type;
            }

            public PagePicBean getPage_pic() {
                return page_pic;
            }

            public void setPage_pic(PagePicBean page_pic) {
                this.page_pic = page_pic;
            }

            public String getPage_url() {
                return page_url;
            }

            public void setPage_url(String page_url) {
                this.page_url = page_url;
            }

            public String getObject_id() {
                return object_id;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }

            public String getPage_title() {
                return page_title;
            }

            public void setPage_title(String page_title) {
                this.page_title = page_title;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent1() {
                return content1;
            }

            public void setContent1(String content1) {
                this.content1 = content1;
            }

            public String getContent2() {
                return content2;
            }

            public void setContent2(String content2) {
                this.content2 = content2;
            }

            public String getVideo_orientation() {
                return video_orientation;
            }

            public void setVideo_orientation(String video_orientation) {
                this.video_orientation = video_orientation;
            }

            public String getPlay_count() {
                return play_count;
            }

            public void setPlay_count(String play_count) {
                this.play_count = play_count;
            }

            public MediaInfoBean getMedia_info() {
                return media_info;
            }

            public void setMedia_info(MediaInfoBean media_info) {
                this.media_info = media_info;
            }

            public Object getUrls() {
                return urls;
            }

            public void setUrls(Object urls) {
                this.urls = urls;
            }

            public VideoDetailsBean getVideo_details() {
                return video_details;
            }

            public void setVideo_details(VideoDetailsBean video_details) {
                this.video_details = video_details;
            }

            public static class PagePicBean {
                /**
                 * width : 640
                 * url : https://imgaliyuncdn.miaopai.com/images/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw___l9od_4.jpg
                 * height : 360
                 */

                private String width;
                private String url;
                private String height;

                public String getWidth() {
                    return width;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }
            }

            public static class MediaInfoBean {
                /**
                 * stream_url : https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_ld&mpflag=16&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video
                 * stream_url_hd : https://gslb.miaopai.com/stream/-KbbsdrY73BJLJxd9j1hXFPlG9WkRocthFlBjw__.mp4?yx=&refer=weibo_app&vend=weibo&label=mp4_hd&mpflag=8&Expires=1561491594&ssig=Vnt6RhEY5t&KID=unistore,video
                 * duration : 89
                 */

                private String stream_url;
                private String stream_url_hd;
                private String duration;

                public String getStream_url() {
                    return stream_url;
                }

                public void setStream_url(String stream_url) {
                    this.stream_url = stream_url;
                }

                public String getStream_url_hd() {
                    return stream_url_hd;
                }

                public void setStream_url_hd(String stream_url_hd) {
                    this.stream_url_hd = stream_url_hd;
                }

                public String getDuration() {
                    return duration;
                }

                public void setDuration(String duration) {
                    this.duration = duration;
                }
            }

            public static class VideoDetailsBean {
                /**
                 * size : 3681280
                 * bitrate : 330
                 * label : mp4_720p
                 */

                private String size;
                private String bitrate;
                private String label;

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getBitrate() {
                    return bitrate;
                }

                public void setBitrate(String bitrate) {
                    this.bitrate = bitrate;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }
            }
        }

        public static class ButtonsBean {
            /**
             * type : follow
             * name : 关注
             * sub_type : 0
             * params : {"uid":1323527941}
             */

            private String type;
            private String name;
            private String sub_type;
            private ParamsBean params;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSub_type() {
                return sub_type;
            }

            public void setSub_type(String sub_type) {
                this.sub_type = sub_type;
            }

            public ParamsBean getParams() {
                return params;
            }

            public void setParams(ParamsBean params) {
                this.params = params;
            }

            public static class ParamsBean {
                /**
                 * uid : 1323527941
                 */

                private String uid;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }
            }
        }
    }
}
