<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ApplyExtOrgdataRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 是	入参加密模式：
    // "0"（默认值）：不加密；
    // "4"：RSA加密
    /**
     * @var string
     */
    public $encryptType;

    // 星火保
    /**
     * @var string
     */
    public $orgName;

    // 外部机构数据类型，取值如下： AXINSUR_BANK_LIVENESS：星火保蚂蚁推荐卡
    /**
     * @var string
     */
    public $dataType;

    // 机构上报数据，json数组
    /**
     * @var string
     */
    public $dataContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'orgName'           => 'org_name',
        'dataType'          => 'data_type',
        'dataContent'       => 'data_content',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('dataContent', $this->dataContent, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->dataContent) {
            $res['data_content'] = $this->dataContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyExtOrgdataRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['data_content'])) {
            $model->dataContent = $map['data_content'];
        }

        return $model;
    }
}
