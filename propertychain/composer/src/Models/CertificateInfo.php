<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CertificateInfo extends Model
{
    // 模板id
    /**
     * @example templateId
     *
     * @var string
     */
    public $templateId;

    // 字典模板定义的数据，key-value的json对象
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $content;

    // 自定义序列（不能重复）
    /**
     * @example 1
     *
     * @var int
     */
    public $bizId;
    protected $_name = [
        'templateId' => 'template_id',
        'content'    => 'content',
        'bizId'      => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('bizId', $this->bizId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
