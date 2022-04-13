<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanAppprogressResponse extends Model
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

    // 应用发布进度详情
    /**
     * @var AppDeployProgress
     */
    public $appDeployProgress;

    // [huanyu场景使用] 查询涉及的部署单元及pod详情列表
    /**
     * @var AppDeployCell[]
     */
    public $affectedCellPods;

    // [huanyu场景使用] json格式的变更对象信息列表
    /**
     * @var string
     */
    public $opscloudChangeTargetJsonStr;
    protected $_name = [
        'reqMsgId'                    => 'req_msg_id',
        'resultCode'                  => 'result_code',
        'resultMsg'                   => 'result_msg',
        'appDeployProgress'           => 'app_deploy_progress',
        'affectedCellPods'            => 'affected_cell_pods',
        'opscloudChangeTargetJsonStr' => 'opscloud_change_target_json_str',
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
        if (null !== $this->appDeployProgress) {
            $res['app_deploy_progress'] = null !== $this->appDeployProgress ? $this->appDeployProgress->toMap() : null;
        }
        if (null !== $this->affectedCellPods) {
            $res['affected_cell_pods'] = [];
            if (null !== $this->affectedCellPods && \is_array($this->affectedCellPods)) {
                $n = 0;
                foreach ($this->affectedCellPods as $item) {
                    $res['affected_cell_pods'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opscloudChangeTargetJsonStr) {
            $res['opscloud_change_target_json_str'] = $this->opscloudChangeTargetJsonStr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanAppprogressResponse
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
        if (isset($map['app_deploy_progress'])) {
            $model->appDeployProgress = AppDeployProgress::fromMap($map['app_deploy_progress']);
        }
        if (isset($map['affected_cell_pods'])) {
            if (!empty($map['affected_cell_pods'])) {
                $model->affectedCellPods = [];
                $n                       = 0;
                foreach ($map['affected_cell_pods'] as $item) {
                    $model->affectedCellPods[$n++] = null !== $item ? AppDeployCell::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['opscloud_change_target_json_str'])) {
            $model->opscloudChangeTargetJsonStr = $map['opscloud_change_target_json_str'];
        }

        return $model;
    }
}
