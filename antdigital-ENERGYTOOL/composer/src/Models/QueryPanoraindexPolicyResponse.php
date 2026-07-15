<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\EpiAdmEnergyPolicyAttachment;

class QueryPanoraindexPolicyResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'id' => 'id',
        'title' => 'title',
        'content' => 'content',
        'attachmentdatalist' => 'attachmentdatalist',
        'sourceurl' => 'sourceurl',
        'releasedate' => 'releasedate',
        'issuingbody' => 'issuingbody',
        'region' => 'region',
        'category' => 'category',
        'policynumber' => 'policynumber',
        'websitecode' => 'websitecode',
        'websitename' => 'websitename',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->attachmentdatalist) {
            $res['attachmentdatalist'] = [];
            if(null !== $this->attachmentdatalist && is_array($this->attachmentdatalist)){
                $n = 0;
                foreach($this->attachmentdatalist as $item){
                    $res['attachmentdatalist'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sourceurl) {
            $res['sourceurl'] = $this->sourceurl;
        }
        if (null !== $this->releasedate) {
            $res['releasedate'] = $this->releasedate;
        }
        if (null !== $this->issuingbody) {
            $res['issuingbody'] = $this->issuingbody;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->policynumber) {
            $res['policynumber'] = $this->policynumber;
        }
        if (null !== $this->websitecode) {
            $res['websitecode'] = $this->websitecode;
        }
        if (null !== $this->websitename) {
            $res['websitename'] = $this->websitename;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryPanoraindexPolicyResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['attachmentdatalist'])){
            if(!empty($map['attachmentdatalist'])){
                $model->attachmentdatalist = [];
                $n = 0;
                foreach($map['attachmentdatalist'] as $item) {
                    $model->attachmentdatalist[$n++] = null !== $item ? EpiAdmEnergyPolicyAttachment::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['sourceurl'])){
            $model->sourceurl = $map['sourceurl'];
        }
        if(isset($map['releasedate'])){
            $model->releasedate = $map['releasedate'];
        }
        if(isset($map['issuingbody'])){
            $model->issuingbody = $map['issuingbody'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['category'])){
            $model->category = $map['category'];
        }
        if(isset($map['policynumber'])){
            $model->policynumber = $map['policynumber'];
        }
        if(isset($map['websitecode'])){
            $model->websitecode = $map['websitecode'];
        }
        if(isset($map['websitename'])){
            $model->websitename = $map['websitename'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 唯一主键
    /**
     * @var int
     */
    public $id;

    // 标题
    /**
     * @var string
     */
    public $title;

    // 政策正文内容
    /**
     * @var string
     */
    public $content;

    // 附件list详情
    /**
     * @var EpiAdmEnergyPolicyAttachment[]
     */
    public $attachmentdatalist;

    // 原文链接
    /**
     * @var string
     */
    public $sourceurl;

    // 政策发布日期
    /**
     * @var string
     */
    public $releasedate;

    // 披露主体
    /**
     * @var string
     */
    public $issuingbody;

    // 政策对应的区域
    /**
     * @var string
     */
    public $region;

    // 政策分类
    /**
     * @var string
     */
    public $category;

    // 政策文号
    /**
     * @var string
     */
    public $policynumber;

    // 来源网站Code码
    /**
     * @var string
     */
    public $websitecode;

    // 来源网站名称
    /**
     * @var string
     */
    public $websitename;

}
