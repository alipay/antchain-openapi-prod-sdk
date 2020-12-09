<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticCreditStatementRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'did' => 'did',
        'endDate' => 'end_date',
        'groupPlatformDid' => 'group_platform_did',
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
     * @return QueryDigitalLogisticCreditStatementRequest
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

    // 需查询对象分布式数字身份不能为空
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

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量 最多100
    /**
     * @var int
     */
    public $pageSize;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
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
