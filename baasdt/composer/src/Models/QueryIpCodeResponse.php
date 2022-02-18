<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpCodeResponse extends Model
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

    // 数字凭证信息
    /**
     * @var IPCodeScannedInfo
     */
    public $codeInfo;

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

    // 扫码次数
    /**
     * @var int
     */
    public $scannedCount;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'codeInfo'         => 'code_info',
        'firstScannedInfo' => 'first_scanned_info',
        'scannedInfoList'  => 'scanned_info_list',
        'scannedCount'     => 'scanned_count',
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
        if (null !== $this->codeInfo) {
            $res['code_info'] = null !== $this->codeInfo ? $this->codeInfo->toMap() : null;
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
        if (null !== $this->scannedCount) {
            $res['scanned_count'] = $this->scannedCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpCodeResponse
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
        if (isset($map['code_info'])) {
            $model->codeInfo = IPCodeScannedInfo::fromMap($map['code_info']);
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
        if (isset($map['scanned_count'])) {
            $model->scannedCount = $map['scanned_count'];
        }

        return $model;
    }
}
