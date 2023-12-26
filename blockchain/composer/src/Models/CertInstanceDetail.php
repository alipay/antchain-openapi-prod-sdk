<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CertInstanceDetail extends Model
{
    // 主键
    /**
     * @example xx
     *
     * @var string
     */
    public $bizId;

    // 实例名称
    /**
     * @example xx
     *
     * @var string
     */
    public $name;

    // 版发者
    /**
     * @example xx
     *
     * @var string
     */
    public $issuer;

    // 实例内容
    /**
     * @example xx
     *
     * @var string
     */
    public $claimContent;

    // 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // 审核建议
    /**
     * @example xx
     *
     * @var string
     */
    public $verifyComment;

    // 创建时间
    /**
     * @example 1701227612000
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 1701227612000
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'bizId'         => 'biz_id',
        'name'          => 'name',
        'issuer'        => 'issuer',
        'claimContent'  => 'claim_content',
        'status'        => 'status',
        'verifyComment' => 'verify_comment',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('claimContent', $this->claimContent, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('verifyComment', $this->verifyComment, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->claimContent) {
            $res['claim_content'] = $this->claimContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->verifyComment) {
            $res['verify_comment'] = $this->verifyComment;
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
     * @return CertInstanceDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['claim_content'])) {
            $model->claimContent = $map['claim_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['verify_comment'])) {
            $model->verifyComment = $map['verify_comment'];
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
