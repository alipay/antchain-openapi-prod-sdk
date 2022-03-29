<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraasmetaEntityResponse extends Model
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

    // 实体名称
    /**
     * @var string
     */
    public $name;

    // 展示名称
    /**
     * @var string
     */
    public $displayName;

    // 实体所属分组名称
    /**
     * @var string
     */
    public $groupName;

    // 实例所属分组展示名称
    /**
     * @var string
     */
    public $groupDisplayName;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'name'             => 'name',
        'displayName'      => 'display_name',
        'groupName'        => 'group_name',
        'groupDisplayName' => 'group_display_name',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->groupDisplayName) {
            $res['group_display_name'] = $this->groupDisplayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraasmetaEntityResponse
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['group_display_name'])) {
            $model->groupDisplayName = $map['group_display_name'];
        }

        return $model;
    }
}
