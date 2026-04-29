<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class TemplateInfo extends Model
{
    // 模板id
    /**
     * @example T20240712134030001693
     *
     * @var string
     */
    public $templateId;

    // 模板版本，不传取最新模板
    /**
     * @example 1
     *
     * @var int
     */
    public $templateVersion;

    // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
    /**
     * @example {"模板key":"模板value"}
     *
     * @var string
     */
    public $templateArgs;

    // 模板所属商户id
    /**
     * @example 91310101MA1FPCXA3G
     *
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'templateId'      => 'template_id',
        'templateVersion' => 'template_version',
        'templateArgs'    => 'template_args',
        'merchantId'      => 'merchant_id',
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
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
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['template_args'])) {
            $model->templateArgs = $map['template_args'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
