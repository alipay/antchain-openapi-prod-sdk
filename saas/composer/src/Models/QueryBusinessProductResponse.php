<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessProductResponse extends Model
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

    // 商业产品sdk客户端的maven依赖信息
    /**
     * @var SdkMavenDependencyInfo
     */
    public $sdkMavenDependencyInfo;

    // 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
    /**
     * @var ApiInfoModel[]
     */
    public $apiInfoModels;

    // 已发布中央仓库的版本
    /**
     * @var string
     */
    public $publishVersion;

    // 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
    /**
     * @var bool
     */
    public $taskRunning;

    // 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
    /**
     * @var string
     */
    public $taskStatus;

    // 能力sla看板url
    /**
     * @var string
     */
    public $slaUrl;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'sdkMavenDependencyInfo' => 'sdk_maven_dependency_info',
        'apiInfoModels'          => 'api_info_models',
        'publishVersion'         => 'publish_version',
        'taskRunning'            => 'task_running',
        'taskStatus'             => 'task_status',
        'slaUrl'                 => 'sla_url',
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
        if (null !== $this->sdkMavenDependencyInfo) {
            $res['sdk_maven_dependency_info'] = null !== $this->sdkMavenDependencyInfo ? $this->sdkMavenDependencyInfo->toMap() : null;
        }
        if (null !== $this->apiInfoModels) {
            $res['api_info_models'] = [];
            if (null !== $this->apiInfoModels && \is_array($this->apiInfoModels)) {
                $n = 0;
                foreach ($this->apiInfoModels as $item) {
                    $res['api_info_models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publishVersion) {
            $res['publish_version'] = $this->publishVersion;
        }
        if (null !== $this->taskRunning) {
            $res['task_running'] = $this->taskRunning;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->slaUrl) {
            $res['sla_url'] = $this->slaUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessProductResponse
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
        if (isset($map['sdk_maven_dependency_info'])) {
            $model->sdkMavenDependencyInfo = SdkMavenDependencyInfo::fromMap($map['sdk_maven_dependency_info']);
        }
        if (isset($map['api_info_models'])) {
            if (!empty($map['api_info_models'])) {
                $model->apiInfoModels = [];
                $n                    = 0;
                foreach ($map['api_info_models'] as $item) {
                    $model->apiInfoModels[$n++] = null !== $item ? ApiInfoModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['publish_version'])) {
            $model->publishVersion = $map['publish_version'];
        }
        if (isset($map['task_running'])) {
            $model->taskRunning = $map['task_running'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['sla_url'])) {
            $model->slaUrl = $map['sla_url'];
        }

        return $model;
    }
}
