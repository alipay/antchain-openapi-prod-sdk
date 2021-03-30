<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TemplateInfo extends Model
{
    // 数据字id
    /**
     * @example 5676989
     *
     * @var string
     */
    public $templateId;

    // 数据字典名称
    /**
     * @example tttt
     *
     * @var string
     */
    public $templateName;

    // 数据字典内容
    /**
     * @example {“key ” : "bvalue"}
     *
     * @var string
     */
    public $template;
    protected $_name = [
        'templateId'   => 'template_id',
        'templateName' => 'template_name',
        'template'     => 'template',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['template'])) {
            $model->template = $map['template'];
        }

        return $model;
    }
}
