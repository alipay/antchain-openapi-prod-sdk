<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PagequeryRollbackSnapshotversionResponse extends Model
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

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 共有多少天记录
    /**
     * @var int
     */
    public $totalCount;

    // 快照版本
    /**
     * @var DeploymentUnitSnapshotOP[]
     */
    public $deploymentUnitSnapshots;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'pageSize'                => 'page_size',
        'currentPage'             => 'current_page',
        'totalCount'              => 'total_count',
        'deploymentUnitSnapshots' => 'deployment_unit_snapshots',
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->deploymentUnitSnapshots) {
            $res['deployment_unit_snapshots'] = [];
            if (null !== $this->deploymentUnitSnapshots && \is_array($this->deploymentUnitSnapshots)) {
                $n = 0;
                foreach ($this->deploymentUnitSnapshots as $item) {
                    $res['deployment_unit_snapshots'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryRollbackSnapshotversionResponse
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['deployment_unit_snapshots'])) {
            if (!empty($map['deployment_unit_snapshots'])) {
                $model->deploymentUnitSnapshots = [];
                $n                              = 0;
                foreach ($map['deployment_unit_snapshots'] as $item) {
                    $model->deploymentUnitSnapshots[$n++] = null !== $item ? DeploymentUnitSnapshotOP::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
