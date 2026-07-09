<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicDictionaryRequest extends Model
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

    // id
    /**
     * @var int
     */
    public $id;

    // 设备品类编码
    /**
     * @var string
     */
    public $deviceCategory;

    // 字典数据类型
    /**
     * @var string
     */
    public $dictionaryType;

    // 字典数据名称
    /**
     * @var string
     */
    public $dictionaryName;

    // 字典数据值
    /**
     * @var string
     */
    public $dictionaryValue;

    // 硬件模块参数
    /**
     * @var string
     */
    public $dictionaryParam;

    // 选择操作
    /**
     * @var string
     */
    public $action;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'deviceCategory'    => 'device_category',
        'dictionaryType'    => 'dictionary_type',
        'dictionaryName'    => 'dictionary_name',
        'dictionaryValue'   => 'dictionary_value',
        'dictionaryParam'   => 'dictionary_param',
        'action'            => 'action',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->deviceCategory) {
            $res['device_category'] = $this->deviceCategory;
        }
        if (null !== $this->dictionaryType) {
            $res['dictionary_type'] = $this->dictionaryType;
        }
        if (null !== $this->dictionaryName) {
            $res['dictionary_name'] = $this->dictionaryName;
        }
        if (null !== $this->dictionaryValue) {
            $res['dictionary_value'] = $this->dictionaryValue;
        }
        if (null !== $this->dictionaryParam) {
            $res['dictionary_param'] = $this->dictionaryParam;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicDictionaryRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['device_category'])) {
            $model->deviceCategory = $map['device_category'];
        }
        if (isset($map['dictionary_type'])) {
            $model->dictionaryType = $map['dictionary_type'];
        }
        if (isset($map['dictionary_name'])) {
            $model->dictionaryName = $map['dictionary_name'];
        }
        if (isset($map['dictionary_value'])) {
            $model->dictionaryValue = $map['dictionary_value'];
        }
        if (isset($map['dictionary_param'])) {
            $model->dictionaryParam = $map['dictionary_param'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }

        return $model;
    }
}
