<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ResembleRiskData extends Model
{
    // 识别结果
    /**
     * @example 成功：1，失败：0
     *
     * @var int
     */
    public $code;

    // 重复作品ID
    /**
     * @example 重复作品ID
     *
     * @var string
     */
    public $workId;

    // 相似值百分比
    /**
     * @example 相似值百分比
     *
     * @var string
     */
    public $resemble;

    // 相似作品下载链接
    /**
     * @example 相似作品下载链接
     *
     * @var string
     */
    public $workDownloadUrl;

    // 风险等级
    /**
     * @example 高3，中2，低1
     *
     * @var int
     */
    public $riskLevel;
    protected $_name = [
        'code'            => 'code',
        'workId'          => 'work_id',
        'resemble'        => 'resemble',
        'workDownloadUrl' => 'work_download_url',
        'riskLevel'       => 'risk_level',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('workId', $this->workId, true);
        Model::validateRequired('resemble', $this->resemble, true);
        Model::validateRequired('workDownloadUrl', $this->workDownloadUrl, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->workId) {
            $res['work_id'] = $this->workId;
        }
        if (null !== $this->resemble) {
            $res['resemble'] = $this->resemble;
        }
        if (null !== $this->workDownloadUrl) {
            $res['work_download_url'] = $this->workDownloadUrl;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResembleRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['work_id'])) {
            $model->workId = $map['work_id'];
        }
        if (isset($map['resemble'])) {
            $model->resemble = $map['resemble'];
        }
        if (isset($map['work_download_url'])) {
            $model->workDownloadUrl = $map['work_download_url'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }

        return $model;
    }
}
