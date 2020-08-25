<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AddTwcNotaryContractFileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'name' => 'name',
        'simpleFormFields' => 'simple_form_fields',
        'templateId' => 'template_id',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->simpleFormFields) {
            $res['simple_form_fields'] = $this->simpleFormFields;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddTwcNotaryContractFileRequest
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
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['simple_form_fields'])){
            $model->simpleFormFields = $map['simple_form_fields'];
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
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

    // 文件名称
    /**
     * @var string
     */
    public $name;

    // 输入项填充内容，以key:value传入
    /**
     * @var string
     */
    public $simpleFormFields;

    // 模板编号
    /**
     * @var string
     */
    public $templateId;

}
