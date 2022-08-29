<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateJusticeCasetemplateRequest extends Model
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

    // 案件要素模板名称
    /**
     * @var string
     */
    public $name;

    // 模板业务类型名称
    /**
     * @var string
     */
    public $bizType;

    // 全流程存证模板ID列表，多个用“,”隔开
    /**
     * @var string
     */
    public $flowTemplates;

    // 模板文件下载地址
    /**
     * @var string
     */
    public $templateFileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'bizType'           => 'biz_type',
        'flowTemplates'     => 'flow_templates',
        'templateFileUrl'   => 'template_file_url',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('flowTemplates', $this->flowTemplates, true);
        Model::validateRequired('templateFileUrl', $this->templateFileUrl, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->flowTemplates) {
            $res['flow_templates'] = $this->flowTemplates;
        }
        if (null !== $this->templateFileUrl) {
            $res['template_file_url'] = $this->templateFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateJusticeCasetemplateRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['flow_templates'])) {
            $model->flowTemplates = $map['flow_templates'];
        }
        if (isset($map['template_file_url'])) {
            $model->templateFileUrl = $map['template_file_url'];
        }

        return $model;
    }
}
