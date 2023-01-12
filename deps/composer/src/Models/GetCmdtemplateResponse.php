<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetCmdtemplateResponse extends Model
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

    // 指令模板详情
    /**
     * @var CmdTemplate
     */
    public $template;

    // 作用域
    /**
     * @var string
     */
    public $scope;

    // 作用域id
    /**
     * @var string[]
     */
    public $scopeIds;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'template'   => 'template',
        'scope'      => 'scope',
        'scopeIds'   => 'scope_ids',
    ];

    public function validate()
    {
        Model::validateRequired('template', $this->template, true);
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
        if (null !== $this->template) {
            $res['template'] = null !== $this->template ? $this->template->toMap() : null;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIds) {
            $res['scope_ids'] = $this->scopeIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCmdtemplateResponse
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
        if (isset($map['template'])) {
            $model->template = CmdTemplate::fromMap($map['template']);
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_ids'])) {
            if (!empty($map['scope_ids'])) {
                $model->scopeIds = $map['scope_ids'];
            }
        }

        return $model;
    }
}
