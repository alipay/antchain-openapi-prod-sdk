<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TemplateData extends Model
{
    // 字典类型ID
    /**
     * @example templateUid
     *
     * @var string
     */
    public $templateUid;

    // 数字字典内容
    /**
     * @example 数字字典内容
     *
     * @var TemplateDataConverter
     */
    public $formData;
    protected $_name = [
        'templateUid' => 'template_uid',
        'formData'    => 'form_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateUid) {
            $res['template_uid'] = $this->templateUid;
        }
        if (null !== $this->formData) {
            $res['form_data'] = null !== $this->formData ? $this->formData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_uid'])) {
            $model->templateUid = $map['template_uid'];
        }
        if (isset($map['form_data'])) {
            $model->formData = TemplateDataConverter::fromMap($map['form_data']);
        }

        return $model;
    }
}
