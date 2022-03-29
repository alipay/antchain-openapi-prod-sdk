<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTraasmetaWorkspacegroupResponse extends Model
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

    // workspace_groups
    /**
     * @var TraasWorkspaceGroupDto[]
     */
    public $workspaceGroups;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'workspaceGroups' => 'workspace_groups',
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
        if (null !== $this->workspaceGroups) {
            $res['workspace_groups'] = [];
            if (null !== $this->workspaceGroups && \is_array($this->workspaceGroups)) {
                $n = 0;
                foreach ($this->workspaceGroups as $item) {
                    $res['workspace_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTraasmetaWorkspacegroupResponse
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
        if (isset($map['workspace_groups'])) {
            if (!empty($map['workspace_groups'])) {
                $model->workspaceGroups = [];
                $n                      = 0;
                foreach ($map['workspace_groups'] as $item) {
                    $model->workspaceGroups[$n++] = null !== $item ? TraasWorkspaceGroupDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
