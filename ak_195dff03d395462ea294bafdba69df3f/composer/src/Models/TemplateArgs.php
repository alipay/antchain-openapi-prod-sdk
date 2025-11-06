<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class TemplateArgs extends Model
{
    // 模板id
    /**
     * @example T1762152216
     *
     * @var string
     */
    public $templateId;

    // 模板版本
    /**
     * @example 1
     *
     * @var string
     */
    public $templateVersion;

    // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
    /**
     * @example {"模板key":"模板value"}
     *
     * @var string
     */
    public $templateArgs;
    protected $_name = [
        'templateId'      => 'template_id',
        'templateVersion' => 'template_version',
        'templateArgs'    => 'template_args',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->templateArgs) {
            $res['template_args'] = $this->templateArgs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateArgs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['template_args'])) {
            $model->templateArgs = $map['template_args'];
        }

        return $model;
    }
}
