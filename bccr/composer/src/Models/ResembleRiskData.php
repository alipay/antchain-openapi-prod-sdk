<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ResembleRiskData extends Model
{
    // 重复作品ID
    /**
     * @example 重复作品ID
     *
     * @var string
     */
    public $workId;

    // 相似作品的名称
    /**
     * @example 相似作品的名称
     *
     * @var string
     */
    public $workName;

    // 相似值
    /**
     * @example 相似值
     *
     * @var string
     */
    public $score;

    // 相似作品下载链接
    /**
     * @example 相似作品下载链接
     *
     * @var string
     */
    public $workDownloadUrl;

    // 相似明细
    /**
     * @example
     *
     * @var ResembleDetail[]
     */
    public $resembleDetails;
    protected $_name = [
        'workId'          => 'work_id',
        'workName'        => 'work_name',
        'score'           => 'score',
        'workDownloadUrl' => 'work_download_url',
        'resembleDetails' => 'resemble_details',
    ];

    public function validate()
    {
        Model::validateRequired('workId', $this->workId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workId) {
            $res['work_id'] = $this->workId;
        }
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->workDownloadUrl) {
            $res['work_download_url'] = $this->workDownloadUrl;
        }
        if (null !== $this->resembleDetails) {
            $res['resemble_details'] = [];
            if (null !== $this->resembleDetails && \is_array($this->resembleDetails)) {
                $n = 0;
                foreach ($this->resembleDetails as $item) {
                    $res['resemble_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (isset($map['work_id'])) {
            $model->workId = $map['work_id'];
        }
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['work_download_url'])) {
            $model->workDownloadUrl = $map['work_download_url'];
        }
        if (isset($map['resemble_details'])) {
            if (!empty($map['resemble_details'])) {
                $model->resembleDetails = [];
                $n                      = 0;
                foreach ($map['resemble_details'] as $item) {
                    $model->resembleDetails[$n++] = null !== $item ? ResembleDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
