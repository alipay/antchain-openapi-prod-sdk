<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class ExecApiAuthtemplateResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 返回的下一层节点集合
    /**
     * @var TreeNode[]
     */
    public $nodes;

    // 树id
    /**
     * @var string
     */
    public $treeTemplateId;

    // 授权状态,提交接口此字段为空
    // 1、正在处理中
    // 2、登陆成功
    /**
     * @var string
     */
    public $authState;

    // 请求是否成功
    // true 成功
    // false 失败
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'nodes'          => 'nodes',
        'treeTemplateId' => 'tree_template_id',
        'authState'      => 'auth_state',
        'success'        => 'success',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->nodes) {
            $res['nodes'] = [];
            if (null !== $this->nodes && \is_array($this->nodes)) {
                $n = 0;
                foreach ($this->nodes as $item) {
                    $res['nodes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->treeTemplateId) {
            $res['tree_template_id'] = $this->treeTemplateId;
        }
        if (null !== $this->authState) {
            $res['auth_state'] = $this->authState;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecApiAuthtemplateResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['nodes'])) {
            if (!empty($map['nodes'])) {
                $model->nodes = [];
                $n            = 0;
                foreach ($map['nodes'] as $item) {
                    $model->nodes[$n++] = null !== $item ? TreeNode::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tree_template_id'])) {
            $model->treeTemplateId = $map['tree_template_id'];
        }
        if (isset($map['auth_state'])) {
            $model->authState = $map['auth_state'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
