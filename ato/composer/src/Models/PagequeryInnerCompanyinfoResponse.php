<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerCompanyinfoResponse extends Model
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

    // 总数
    /**
     * @var int
     */
    public $total;

    // 公司信息
    /**
     * @var CompanySummaryInfo[]
     */
    public $companyInfo;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'total'       => 'total',
        'companyInfo' => 'company_info',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->companyInfo) {
            $res['company_info'] = [];
            if (null !== $this->companyInfo && \is_array($this->companyInfo)) {
                $n = 0;
                foreach ($this->companyInfo as $item) {
                    $res['company_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerCompanyinfoResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['company_info'])) {
            if (!empty($map['company_info'])) {
                $model->companyInfo = [];
                $n                  = 0;
                foreach ($map['company_info'] as $item) {
                    $model->companyInfo[$n++] = null !== $item ? CompanySummaryInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
