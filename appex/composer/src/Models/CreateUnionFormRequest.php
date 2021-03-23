<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateUnionFormRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟ID
    /**
     * @var int
     */
    public $unionId;

    // Channel名称
    /**
     * @var string
     */
    public $channelName;

    // 业务单据号
    /**
     * @var string
     */
    public $formId;

    // 业务单据类型
    /**
     * @var string
     */
    public $formType;

    // 原生单据json字符串
    /**
     * @var string
     */
    public $formBody;

    // 用户自定义的图ID，开启图功能时传入
    /**
     * @var string
     */
    public $graphId;

    // 用户自定义的LineNode名称
    /**
     * @var string
     */
    public $lineNode;

    // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
    /**
     * @var string
     */
    public $traceId;

    // 表单的直接上游节点formId
    /**
     * @var string[]
     */
    public $parentFormIdList;

    // 表单的直接下游节点formId
    /**
     * @var string[]
     */
    public $childFormIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
        'formId'            => 'form_id',
        'formType'          => 'form_type',
        'formBody'          => 'form_body',
        'graphId'           => 'graph_id',
        'lineNode'          => 'line_node',
        'traceId'           => 'trace_id',
        'parentFormIdList'  => 'parent_form_id_list',
        'childFormIdList'   => 'child_form_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('formId', $this->formId, true);
        Model::validateRequired('formType', $this->formType, true);
        Model::validateRequired('formBody', $this->formBody, true);
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
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->formId) {
            $res['form_id'] = $this->formId;
        }
        if (null !== $this->formType) {
            $res['form_type'] = $this->formType;
        }
        if (null !== $this->formBody) {
            $res['form_body'] = $this->formBody;
        }
        if (null !== $this->graphId) {
            $res['graph_id'] = $this->graphId;
        }
        if (null !== $this->lineNode) {
            $res['line_node'] = $this->lineNode;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->parentFormIdList) {
            $res['parent_form_id_list'] = $this->parentFormIdList;
        }
        if (null !== $this->childFormIdList) {
            $res['child_form_id_list'] = $this->childFormIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUnionFormRequest
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
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['form_id'])) {
            $model->formId = $map['form_id'];
        }
        if (isset($map['form_type'])) {
            $model->formType = $map['form_type'];
        }
        if (isset($map['form_body'])) {
            $model->formBody = $map['form_body'];
        }
        if (isset($map['graph_id'])) {
            $model->graphId = $map['graph_id'];
        }
        if (isset($map['line_node'])) {
            $model->lineNode = $map['line_node'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['parent_form_id_list'])) {
            if (!empty($map['parent_form_id_list'])) {
                $model->parentFormIdList = $map['parent_form_id_list'];
            }
        }
        if (isset($map['child_form_id_list'])) {
            if (!empty($map['child_form_id_list'])) {
                $model->childFormIdList = $map['child_form_id_list'];
            }
        }

        return $model;
    }
}
