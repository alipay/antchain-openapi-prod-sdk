<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class UpdateFinanceReportRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 报告单号
    /**
     * @var string
     */
    public $reportNo;

    // 银行碳账号
    /**
     * @var string
     */
    public $enterpriseNo;

    // 报告盖章人
    /**
     * @var string
     */
    public $reportSinger;

    // 可以直接公网可以下载的oss地址
    /**
     * @var string
     */
    public $reportOssUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'reportNo'          => 'report_no',
        'enterpriseNo'      => 'enterprise_no',
        'reportSinger'      => 'report_singer',
        'reportOssUrl'      => 'report_oss_url',
    ];

    public function validate()
    {
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('reportSinger', $this->reportSinger, true);
        Model::validateRequired('reportOssUrl', $this->reportOssUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->reportSinger) {
            $res['report_singer'] = $this->reportSinger;
        }
        if (null !== $this->reportOssUrl) {
            $res['report_oss_url'] = $this->reportOssUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFinanceReportRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['report_singer'])) {
            $model->reportSinger = $map['report_singer'];
        }
        if (isset($map['report_oss_url'])) {
            $model->reportOssUrl = $map['report_oss_url'];
        }

        return $model;
    }
}
