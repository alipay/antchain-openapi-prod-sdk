<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f9cb6523d99f4d089e97d549f141e6e4\Models;

use AlibabaCloud\Tea\Model;

class ExecBlockchainTaxIcmSyncgatheringRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 机构号码
    /**
     * @var string
     */
    public $instCode;

    // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
    /**
     * @var string
     */
    public $bizRequestId;

    // 纳税人识别号(必填)
    /**
     * @var string
     */
    public $identityId;

    // 授权类型(必填)
    /**
     * @var string
     */
    public $authType;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
    /**
     * @var string
     */
    public $content;

    // 查询类型
    // NORMAL 正常调用
    // BATCH_HAND  批刷
    /**
     * @var string
     */
    public $queryType;

    // 子机构编码，字典由系统预设白名单
    /**
     * @var string
     */
    public $subTenant;

    // 优先级，越大优先级越高
    /**
     * @var string
     */
    public $usePriority;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instCode'          => 'inst_code',
        'bizRequestId'      => 'biz_request_id',
        'identityId'        => 'identity_id',
        'authType'          => 'auth_type',
        'orderNo'           => 'order_no',
        'content'           => 'content',
        'queryType'         => 'query_type',
        'subTenant'         => 'sub_tenant',
        'usePriority'       => 'use_priority',
    ];

    public function validate()
    {
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('bizRequestId', $this->bizRequestId, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->subTenant) {
            $res['sub_tenant'] = $this->subTenant;
        }
        if (null !== $this->usePriority) {
            $res['use_priority'] = $this->usePriority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecBlockchainTaxIcmSyncgatheringRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['sub_tenant'])) {
            $model->subTenant = $map['sub_tenant'];
        }
        if (isset($map['use_priority'])) {
            $model->usePriority = $map['use_priority'];
        }

        return $model;
    }
}
