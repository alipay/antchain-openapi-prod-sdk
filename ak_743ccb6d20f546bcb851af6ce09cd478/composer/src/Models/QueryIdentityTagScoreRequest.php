<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_743ccb6d20f546bcb851af6ce09cd478\Models;

use AlibabaCloud\Tea\Model;

class QueryIdentityTagScoreRequest extends Model
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

    // 请求流水id
    /**
     * @var string
     */
    public $requestId;

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 模型列表字符串
    /**
     * @var string
     */
    public $modelIdList;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户id类型：
    // "ID_NO"： 身份证号,
    // "MOBILE_NO"：手机号
    /**
     * @var string
     */
    public $userIdType;

    // 加密类型:
    // "MD5"：MD5（32位小写）
    // "SHA256" ： SHA256（密文小写）
    // "SM3"： SM3（密文大写
    /**
     * @var string
     */
    public $encryptType;

    // 用户授权模版编号
    /**
     * @var string
     */
    public $authTemplateNo;

    // 用户授权编码
    /**
     * @var string
     */
    public $authNo;

    // 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
    /**
     * @var string
     */
    public $requestTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'orderId'           => 'order_id',
        'modelIdList'       => 'model_id_list',
        'userId'            => 'user_id',
        'userIdType'        => 'user_id_type',
        'encryptType'       => 'encrypt_type',
        'authTemplateNo'    => 'auth_template_no',
        'authNo'            => 'auth_no',
        'requestTime'       => 'request_time',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('modelIdList', $this->modelIdList, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('authTemplateNo', $this->authTemplateNo, true);
        Model::validateRequired('authNo', $this->authNo, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->modelIdList) {
            $res['model_id_list'] = $this->modelIdList;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->authTemplateNo) {
            $res['auth_template_no'] = $this->authTemplateNo;
        }
        if (null !== $this->authNo) {
            $res['auth_no'] = $this->authNo;
        }
        if (null !== $this->requestTime) {
            $res['request_time'] = $this->requestTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdentityTagScoreRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['model_id_list'])) {
            $model->modelIdList = $map['model_id_list'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['auth_template_no'])) {
            $model->authTemplateNo = $map['auth_template_no'];
        }
        if (isset($map['auth_no'])) {
            $model->authNo = $map['auth_no'];
        }
        if (isset($map['request_time'])) {
            $model->requestTime = $map['request_time'];
        }

        return $model;
    }
}
