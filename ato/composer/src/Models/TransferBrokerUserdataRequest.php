<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TransferBrokerUserdataRequest extends Model
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

    // 数据的唯一id，支持数字、大小写字母或下划线
    /**
     * @var string
     */
    public $dataId;

    // 枚举，数据类型
    /**
     * @var string
     */
    public $dataType;

    // 数据内容,使用JSONArray结构
    /**
     * @var string
     */
    public $dataContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'dataType'          => 'data_type',
        'dataContent'       => 'data_content',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('dataContent', $this->dataContent, true);
        Model::validateMaxLength('dataId', $this->dataId, 20);
        Model::validateMinLength('dataId', $this->dataId, 10);
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
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
     * @return TransferBrokerUserdataRequest
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
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
