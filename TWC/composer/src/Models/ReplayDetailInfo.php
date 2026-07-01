<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ReplayDetailInfo extends Model
{
    // 回复人名称
    /**
     * @example 刘*
     *
     * @var string
     */
    public $replierName;

    // 回复人角色
    // 用户：USER
    // 商家：MERCHANT
    // 系统：SYSTEM
    // 审核小二：AUDITOR
    // 政府单位：GOVERNMENT
    /**
     * @example USER
     *
     * @var string
     */
    public $replierRole;

    // 回复时间
    /**
     * @example 2020-02-14 14:23:12
     *
     * @var string
     */
    public $gmtCreate;

    // 回复内容
    /**
     * @example 已退款退货给您，物流单号为：12344444
     *
     * @var string
     */
    public $content;

    // 回复图片
    /**
     * @example http://mdn.alipay.com/wsdk/img?fileid=A*ME4GQq2j-5oAAAAAAAAAAAAAAQAAAQ&t=83fed12ef006ebcd8df04dfe79faad6c&bi=openpunsh&ts=0&zoom=original
     *
     * @var string[]
     */
    public $images;
    protected $_name = [
        'replierName' => 'replier_name',
        'replierRole' => 'replier_role',
        'gmtCreate'   => 'gmt_create',
        'content'     => 'content',
        'images'      => 'images',
    ];

    public function validate()
    {
        Model::validateRequired('replierName', $this->replierName, true);
        Model::validateRequired('replierRole', $this->replierRole, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('images', $this->images, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->replierName) {
            $res['replier_name'] = $this->replierName;
        }
        if (null !== $this->replierRole) {
            $res['replier_role'] = $this->replierRole;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplayDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['replier_name'])) {
            $model->replierName = $map['replier_name'];
        }
        if (isset($map['replier_role'])) {
            $model->replierRole = $map['replier_role'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['images'])) {
            if (!empty($map['images'])) {
                $model->images = $map['images'];
            }
        }

        return $model;
    }
}
