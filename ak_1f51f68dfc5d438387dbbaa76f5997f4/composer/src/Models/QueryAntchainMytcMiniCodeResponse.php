<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1f51f68dfc5d438387dbbaa76f5997f4\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainMytcMiniCodeResponse extends Model
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

    // 首次扫描信息
    /**
     * @var ScanHeadInfo
     */
    public $scanInfo;

    // 溯源环节信息列表
    /**
     * @var PhaseInfo[]
     */
    public $phaseInfos;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'scanInfo'   => 'scan_info',
        'phaseInfos' => 'phase_infos',
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
        if (null !== $this->scanInfo) {
            $res['scan_info'] = null !== $this->scanInfo ? $this->scanInfo->toMap() : null;
        }
        if (null !== $this->phaseInfos) {
            $res['phase_infos'] = [];
            if (null !== $this->phaseInfos && \is_array($this->phaseInfos)) {
                $n = 0;
                foreach ($this->phaseInfos as $item) {
                    $res['phase_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainMytcMiniCodeResponse
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
        if (isset($map['scan_info'])) {
            $model->scanInfo = ScanHeadInfo::fromMap($map['scan_info']);
        }
        if (isset($map['phase_infos'])) {
            if (!empty($map['phase_infos'])) {
                $model->phaseInfos = [];
                $n                 = 0;
                foreach ($map['phase_infos'] as $item) {
                    $model->phaseInfos[$n++] = null !== $item ? PhaseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
