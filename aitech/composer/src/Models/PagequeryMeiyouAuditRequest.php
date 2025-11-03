<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class PagequeryMeiyouAuditRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 主键id
    /**
     * @var int
     */
    public $id;

    // 页面
    /**
     * @var int
     */
    public $pageNum;

    // 审核记录ID
    /**
     * @var int
     */
    public $auditId;

    // 大小
    /**
     * @var int
     */
    public $pageSize;

    // 主题ID
    /**
     * @var int
     */
    public $topicId;

    // 内容文本
    /**
     * @var string
     */
    public $content;

    // 一级业务
    /**
     * @var string
     */
    public $primaryBusiness;

    // 二级业务
    /**
     * @var string
     */
    public $secondaryBusiness;

    // 审核结果
    /**
     * @var string
     */
    public $auditResult;

    // 审核原因
    /**
     * @var string
     */
    public $auditReason;

    // 创建时间-start
    /**
     * @var string
     */
    public $gmtCreateStart;

    // 创建时间-end
    /**
     * @var string
     */
    public $gmtCreateEnd;

    // 数据来源
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'pageNum'           => 'page_num',
        'auditId'           => 'audit_id',
        'pageSize'          => 'page_size',
        'topicId'           => 'topic_id',
        'content'           => 'content',
        'primaryBusiness'   => 'primary_business',
        'secondaryBusiness' => 'secondary_business',
        'auditResult'       => 'audit_result',
        'auditReason'       => 'audit_reason',
        'gmtCreateStart'    => 'gmt_create_start',
        'gmtCreateEnd'      => 'gmt_create_end',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->topicId) {
            $res['topic_id'] = $this->topicId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->primaryBusiness) {
            $res['primary_business'] = $this->primaryBusiness;
        }
        if (null !== $this->secondaryBusiness) {
            $res['secondary_business'] = $this->secondaryBusiness;
        }
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }
        if (null !== $this->auditReason) {
            $res['audit_reason'] = $this->auditReason;
        }
        if (null !== $this->gmtCreateStart) {
            $res['gmt_create_start'] = $this->gmtCreateStart;
        }
        if (null !== $this->gmtCreateEnd) {
            $res['gmt_create_end'] = $this->gmtCreateEnd;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryMeiyouAuditRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['topic_id'])) {
            $model->topicId = $map['topic_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['primary_business'])) {
            $model->primaryBusiness = $map['primary_business'];
        }
        if (isset($map['secondary_business'])) {
            $model->secondaryBusiness = $map['secondary_business'];
        }
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }
        if (isset($map['audit_reason'])) {
            $model->auditReason = $map['audit_reason'];
        }
        if (isset($map['gmt_create_start'])) {
            $model->gmtCreateStart = $map['gmt_create_start'];
        }
        if (isset($map['gmt_create_end'])) {
            $model->gmtCreateEnd = $map['gmt_create_end'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
