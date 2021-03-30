<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AssetTemplate extends Model
{
    // 模板类型id
    /**
     * @example categoryId
     *
     * @var string
     */
    public $categoryId;

    // 模板内容
    /**
     * @example 模板内容
     *
     * @var string
     */
    public $content;

    // 模板id
    /**
     * @example templateId
     *
     * @var string
     */
    public $templateId;

    // 模板名称
    /**
     * @example templateName
     *
     * @var string
     */
    public $templateName;

    // 是否生效
    /**
     * @example true, false
     *
     * @var bool
     */
    public $valid;

    // 是否使用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $used;

    // 版本号
    /**
     * @example 1.0.1
     *
     * @var string
     */
    public $version;

    // 联盟Id
    /**
     * @example leagueUid
     *
     * @var string
     */
    public $leagueUid;

    // 标准数据字典
    /**
     * @example true, false
     *
     * @var bool
     */
    public $standard;
    protected $_name = [
        'categoryId'   => 'category_id',
        'content'      => 'content',
        'templateId'   => 'template_id',
        'templateName' => 'template_name',
        'valid'        => 'valid',
        'used'         => 'used',
        'version'      => 'version',
        'leagueUid'    => 'league_uid',
        'standard'     => 'standard',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->valid) {
            $res['valid'] = $this->valid;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->leagueUid) {
            $res['league_uid'] = $this->leagueUid;
        }
        if (null !== $this->standard) {
            $res['standard'] = $this->standard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['valid'])) {
            $model->valid = $map['valid'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['league_uid'])) {
            $model->leagueUid = $map['league_uid'];
        }
        if (isset($map['standard'])) {
            $model->standard = $map['standard'];
        }

        return $model;
    }
}
