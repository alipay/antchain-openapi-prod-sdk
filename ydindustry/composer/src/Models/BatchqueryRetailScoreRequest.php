<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YDINDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryRetailScoreRequest extends Model
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

    // 模型id
    /**
     * @var string
     */
    public $industryId;

    // 用户列表
    /**
     * @var string[]
     */
    public $userIdList;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    /**
     * @var string
     */
    public $userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, ...
    /**
     * @var string
     */
    public $encryptType;

    // 客户编码
    /**
     * @var string
     */
    public $customerCode;

    // 流水号，串联链路用，非必填
    /**
     * @var string
     */
    public $transNo;

    // 场景编码
    /**
     * @var string
     */
    public $instanceCode;

    // 1 moble入参，id自动映射
    // 2 id入参，id自动映射
    // 3 id入参，mobile自动映射
    /**
     * @var string
     */
    public $mappingType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'industryId'        => 'industry_id',
        'userIdList'        => 'user_id_list',
        'userIdType'        => 'user_id_type',
        'encryptType'       => 'encrypt_type',
        'customerCode'      => 'customer_code',
        'transNo'           => 'trans_no',
        'instanceCode'      => 'instance_code',
        'mappingType'       => 'mapping_type',
    ];

    public function validate()
    {
        Model::validateRequired('industryId', $this->industryId, true);
        Model::validateRequired('userIdList', $this->userIdList, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('customerCode', $this->customerCode, true);
        Model::validateRequired('transNo', $this->transNo, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('mappingType', $this->mappingType, true);
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
        if (null !== $this->industryId) {
            $res['industry_id'] = $this->industryId;
        }
        if (null !== $this->userIdList) {
            $res['user_id_list'] = $this->userIdList;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->customerCode) {
            $res['customer_code'] = $this->customerCode;
        }
        if (null !== $this->transNo) {
            $res['trans_no'] = $this->transNo;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->mappingType) {
            $res['mapping_type'] = $this->mappingType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryRetailScoreRequest
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
        if (isset($map['industry_id'])) {
            $model->industryId = $map['industry_id'];
        }
        if (isset($map['user_id_list'])) {
            if (!empty($map['user_id_list'])) {
                $model->userIdList = $map['user_id_list'];
            }
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['customer_code'])) {
            $model->customerCode = $map['customer_code'];
        }
        if (isset($map['trans_no'])) {
            $model->transNo = $map['trans_no'];
        }
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }
        if (isset($map['mapping_type'])) {
            $model->mappingType = $map['mapping_type'];
        }

        return $model;
    }
}
