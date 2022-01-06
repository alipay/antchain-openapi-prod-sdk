<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuditLogModel extends Model
{
    // 主键
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 操作类型
    /**
     * @example add
     *
     * @var string
     */
    public $operateType;

    // sofa.ms.auditlogs.list
    /**
     * @example 操作接口
     *
     * @var string
     */
    public $operateInterface;

    // 描述信息
    /**
     * @example 新增鉴权规则
     *
     * @var string
     */
    public $description;

    // 请求参数
    /**
     * @example {”instanceId“: "000001"}
     *
     * @var string
     */
    public $content;

    // 响应结果
    /**
     * @example {"result_code": "OK"}
     *
     * @var string
     */
    public $response;

    // 0 失败 1 成功
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 操作人
    /**
     * @example kele.kl
     *
     * @var string
     */
    public $operator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'               => 'id',
        'instanceId'       => 'instance_id',
        'operateType'      => 'operate_type',
        'operateInterface' => 'operate_interface',
        'description'      => 'description',
        'content'          => 'content',
        'response'         => 'response',
        'status'           => 'status',
        'operator'         => 'operator',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->operateInterface) {
            $res['operate_interface'] = $this->operateInterface;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->response) {
            $res['response'] = $this->response;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
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
     * @return AuditLogModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['operate_interface'])) {
            $model->operateInterface = $map['operate_interface'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['response'])) {
            $model->response = $map['response'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
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
