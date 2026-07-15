<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryPanoraindexPolicyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'title' => 'title',
        'titleorregionlike' => 'titleorregionlike',
        'pagesize' => 'pagesize',
        'orderby' => 'orderby',
        'orderdirection' => 'orderdirection',
        'minid' => 'minid',
        'pagenum' => 'pagenum',
        'websitecode' => 'websitecode',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->titleorregionlike) {
            $res['titleorregionlike'] = $this->titleorregionlike;
        }
        if (null !== $this->pagesize) {
            $res['pagesize'] = $this->pagesize;
        }
        if (null !== $this->orderby) {
            $res['orderby'] = $this->orderby;
        }
        if (null !== $this->orderdirection) {
            $res['orderdirection'] = $this->orderdirection;
        }
        if (null !== $this->minid) {
            $res['minid'] = $this->minid;
        }
        if (null !== $this->pagenum) {
            $res['pagenum'] = $this->pagenum;
        }
        if (null !== $this->websitecode) {
            $res['websitecode'] = $this->websitecode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryPanoraindexPolicyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['titleorregionlike'])){
            $model->titleorregionlike = $map['titleorregionlike'];
        }
        if(isset($map['pagesize'])){
            $model->pagesize = $map['pagesize'];
        }
        if(isset($map['orderby'])){
            $model->orderby = $map['orderby'];
        }
        if(isset($map['orderdirection'])){
            $model->orderdirection = $map['orderdirection'];
        }
        if(isset($map['minid'])){
            $model->minid = $map['minid'];
        }
        if(isset($map['pagenum'])){
            $model->pagenum = $map['pagenum'];
        }
        if(isset($map['websitecode'])){
            if(!empty($map['websitecode'])){
                $model->websitecode = $map['websitecode'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 根据标题模糊搜搜
    /**
     * @var string
     */
    public $title;

    // 根据标题或地区模糊搜索
    /**
     * @var string
     */
    public $titleorregionlike;

    // 一页数据量，最大100
    /**
     * @var int
     */
    public $pagesize;

    // 排序字段
    /**
     * @var string
     */
    public $orderby;

    // 排序方向（ASC/DESC，默认为DESC）
    /**
     * @var string
     */
    public $orderdirection;

    // 最小id，用于游标翻页
    /**
     * @var int
     */
    public $minid;

    // 页号
    /**
     * @var int
     */
    public $pagenum;

    // 来源网站code码，可批量查询最多填15个
    /**
     * @var string[]
     */
    public $websitecode;

}
