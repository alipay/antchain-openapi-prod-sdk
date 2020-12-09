<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticCreditIssuebytimeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'did' => 'did',
        'endDate' => 'end_date',
        'groupPlatformDid' => 'group_platform_did',
        'issuedOnly' => 'issued_only',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'platformDid' => 'platform_did',
        'productId' => 'product_id',
        'startDate' => 'start_date',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issuedOnly) {
            $res['issued_only'] = $this->issuedOnly;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticCreditIssuebytimeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['did'])){
            $model->did = $map['did'];
        }
        if(isset($map['end_date'])){
            $model->endDate = $map['end_date'];
        }
        if(isset($map['group_platform_did'])){
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if(isset($map['issued_only'])){
            $model->issuedOnly = $map['issued_only'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 指定查询者分布式数字身份
    /**
     * @var string
     */
    public $did;

    // 查询截止时间
    /**
     * @var string
     */
    public $endDate;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 是否只返回已发行凭证信息
    /**
     * @var bool
     */
    public $issuedOnly;

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量 不超过100
    /**
     * @var int
     */
    public $pageSize;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id 目前填PRODUCT_MYBANK
    /**
     * @var string
     */
    public $productId;

    // 查询起始时间
    /**
     * @var string
     */
    public $startDate;

}
