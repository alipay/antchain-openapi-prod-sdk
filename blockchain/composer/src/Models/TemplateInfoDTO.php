<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TemplateInfoDTO extends Model
{
    // 主键
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 模板类别：马拉松类、滑雪类
    /**
     * @example marathon
     *
     * @var string
     */
    public $category;

    // 模板内容， json格式文本
    /**
     * @example {}
     *
     * @var string
     */
    public $claimTemplate;

    // 创建时间
    /**
     * @example 2021-01-01 00:00:00
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2021-01-01 00:00:00
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'            => 'id',
        'category'      => 'category',
        'claimTemplate' => 'claim_template',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('claimTemplate', $this->claimTemplate, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->claimTemplate) {
            $res['claim_template'] = $this->claimTemplate;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['claim_template'])) {
            $model->claimTemplate = $map['claim_template'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
