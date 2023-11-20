<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiHaiguanasyncRequest extends Model
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

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    /**
     * @var string
     */
    public $instCode;

    // 产品类型，海关数据: ZX500
    /**
     * @var string
     */
    public $authType;

    // 身份id，企业税号
    /**
     * @var string
     */
    public $identityId;

    // 用于幂等控制
    /**
     * @var string
     */
    public $bizRequestId;

    // 行方生成的授权编号
    /**
     * @var string
     */
    public $authCode;

    // 公网可访问的地址，PDF格式
    /**
     * @var string
     */
    public $authUrl;

    // 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $authStartTime;

    // 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $authEndTime;

    // 企业名称
    /**
     * @var string
     */
    public $corpName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instCode'          => 'inst_code',
        'authType'          => 'auth_type',
        'identityId'        => 'identity_id',
        'bizRequestId'      => 'biz_request_id',
        'authCode'          => 'auth_code',
        'authUrl'           => 'auth_url',
        'authStartTime'     => 'auth_start_time',
        'authEndTime'       => 'auth_end_time',
        'corpName'          => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('bizRequestId', $this->bizRequestId, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('authUrl', $this->authUrl, true);
        Model::validateRequired('authStartTime', $this->authStartTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiHaiguanasyncRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
