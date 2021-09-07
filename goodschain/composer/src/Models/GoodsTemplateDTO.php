<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GoodsTemplateDTO extends Model
{
    // 模板id
    /**
     * @example 123098
     *
     * @var string
     */
    public $templateId;

    // 商品名称
    /**
     * @example 酒证
     *
     * @var string
     */
    public $name;

    // 商品模板描述
    /**
     * @example [{"type":"TXT","name":"公司名称"},{"type":"TXT","name":"所属地址"},{"type":"TXT","name":"法人"}]
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'templateId' => 'template_id',
        'name'       => 'name',
        'content'    => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsTemplateDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
