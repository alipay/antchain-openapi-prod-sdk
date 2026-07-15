<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\UnfinishedUpgradeTaskVO;

class QueryElectrocarTaskstatusResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tasks' => 'tasks',
        'hubQueryFailed' => 'hub_query_failed',
        'localQueryFailed' => 'local_query_failed',
        'versionReportFailed' => 'version_report_failed',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->tasks) {
            $res['tasks'] = [];
            if(null !== $this->tasks && is_array($this->tasks)){
                $n = 0;
                foreach($this->tasks as $item){
                    $res['tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->hubQueryFailed) {
            $res['hub_query_failed'] = $this->hubQueryFailed;
        }
        if (null !== $this->localQueryFailed) {
            $res['local_query_failed'] = $this->localQueryFailed;
        }
        if (null !== $this->versionReportFailed) {
            $res['version_report_failed'] = $this->versionReportFailed;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectrocarTaskstatusResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['tasks'])){
            if(!empty($map['tasks'])){
                $model->tasks = [];
                $n = 0;
                foreach($map['tasks'] as $item) {
                    $model->tasks[$n++] = null !== $item ? UnfinishedUpgradeTaskVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['hub_query_failed'])){
            $model->hubQueryFailed = $map['hub_query_failed'];
        }
        if(isset($map['local_query_failed'])){
            $model->localQueryFailed = $map['local_query_failed'];
        }
        if(isset($map['version_report_failed'])){
            $model->versionReportFailed = $map['version_report_failed'];
        }
        return $model;
    }
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

    // 聚合后的待处理 OTA 任务列表，已按状态优先级和创建时间排序
    /**
     * @var UnfinishedUpgradeTaskVO[]
     */
    public $tasks;

    // 是否存在 Hub 通道查询失败；true 表示返回结果可能缺少 4G 任务
    /**
     * @var bool
     */
    public $hubQueryFailed;

    // 是否存在本地通道查询失败；true 表示返回结果可能缺少 BLE/本地任务
    /**
     * @var bool
     */
    public $localQueryFailed;

    // 上报版本并查询升级场景下，版本上报是否失败
    /**
     * @var bool
     */
    public $versionReportFailed;

}
