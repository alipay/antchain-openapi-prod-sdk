<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CheckIpCodeResponse extends Model
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

    // 被扫描的次数(包含本次)
    /**
     * @var int
     */
    public $scannedCount;

    // null，暂不使用该值//扫描历史列表(仅展示最近扫描的50次信息)
    /**
     * @var IPCodeScannedInfo[]
     */
    public $scannedList;

    // 数字凭证的详情，始终不为空，如果类型中的user_name为空，则数字凭证未领取，如果不为空，则数字凭证已领取
    /**
     * @var IPCodeScannedInfo
     */
    public $codeDetail;

    // 首次扫码信息
    /**
     * @var IPSimpleScannedInfo
     */
    public $firstScannedInfo;

    // 扫码信息
    /**
     * @var IPSimpleScannedInfo[]
     */
    public $scannedInfoList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'scannedCount'     => 'scanned_count',
        'scannedList'      => 'scanned_list',
        'codeDetail'       => 'code_detail',
        'firstScannedInfo' => 'first_scanned_info',
        'scannedInfoList'  => 'scanned_info_list',
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
        if (null !== $this->scannedCount) {
            $res['scanned_count'] = $this->scannedCount;
        }
        if (null !== $this->scannedList) {
            $res['scanned_list'] = [];
            if (null !== $this->scannedList && \is_array($this->scannedList)) {
                $n = 0;
                foreach ($this->scannedList as $item) {
                    $res['scanned_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->codeDetail) {
            $res['code_detail'] = null !== $this->codeDetail ? $this->codeDetail->toMap() : null;
        }
        if (null !== $this->firstScannedInfo) {
            $res['first_scanned_info'] = null !== $this->firstScannedInfo ? $this->firstScannedInfo->toMap() : null;
        }
        if (null !== $this->scannedInfoList) {
            $res['scanned_info_list'] = [];
            if (null !== $this->scannedInfoList && \is_array($this->scannedInfoList)) {
                $n = 0;
                foreach ($this->scannedInfoList as $item) {
                    $res['scanned_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckIpCodeResponse
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
        if (isset($map['scanned_count'])) {
            $model->scannedCount = $map['scanned_count'];
        }
        if (isset($map['scanned_list'])) {
            if (!empty($map['scanned_list'])) {
                $model->scannedList = [];
                $n                  = 0;
                foreach ($map['scanned_list'] as $item) {
                    $model->scannedList[$n++] = null !== $item ? IPCodeScannedInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code_detail'])) {
            $model->codeDetail = IPCodeScannedInfo::fromMap($map['code_detail']);
        }
        if (isset($map['first_scanned_info'])) {
            $model->firstScannedInfo = IPSimpleScannedInfo::fromMap($map['first_scanned_info']);
        }
        if (isset($map['scanned_info_list'])) {
            if (!empty($map['scanned_info_list'])) {
                $model->scannedInfoList = [];
                $n                      = 0;
                foreach ($map['scanned_info_list'] as $item) {
                    $model->scannedInfoList[$n++] = null !== $item ? IPSimpleScannedInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
