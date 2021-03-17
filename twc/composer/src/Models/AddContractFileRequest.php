<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AddContractFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 文件名称
    /**
     * @var string
     */
    public $name;

    // 模板编号
    /**
     * @var string
     */
    public $templateId;

    // 输入项填充内容，以key:value传入
    /**
     * @var string
     */
    public $simpleFormFields;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'templateId'        => 'template_id',
        'simpleFormFields'  => 'simple_form_fields',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('simpleFormFields', $this->simpleFormFields, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->simpleFormFields) {
            $res['simple_form_fields'] = $this->simpleFormFields;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddContractFileRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['simple_form_fields'])) {
            $model->simpleFormFields = $map['simple_form_fields'];
        }

        return $model;
    }
}
