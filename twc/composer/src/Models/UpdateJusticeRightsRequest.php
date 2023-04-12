<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateJusticeRightsRequest extends Model
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

    // 案件维权记录编号
    /**
     * @var int
     */
    public $recordId;

    // 案件状态(枚举)
    /**
     * @var string
     */
    public $caseStatus;

    // 状态扩展信息示例查看对接文档
    /**
     * @var string
     */
    public $statusExt;

    // 文件信息,示例查看对接文档
    /**
     * @var FileInfo[]
     */
    public $statusFileInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'recordId'          => 'record_id',
        'caseStatus'        => 'case_status',
        'statusExt'         => 'status_ext',
        'statusFileInfos'   => 'status_file_infos',
    ];

    public function validate()
    {
        Model::validateRequired('recordId', $this->recordId, true);
        Model::validateRequired('caseStatus', $this->caseStatus, true);
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
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->caseStatus) {
            $res['case_status'] = $this->caseStatus;
        }
        if (null !== $this->statusExt) {
            $res['status_ext'] = $this->statusExt;
        }
        if (null !== $this->statusFileInfos) {
            $res['status_file_infos'] = [];
            if (null !== $this->statusFileInfos && \is_array($this->statusFileInfos)) {
                $n = 0;
                foreach ($this->statusFileInfos as $item) {
                    $res['status_file_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateJusticeRightsRequest
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
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['case_status'])) {
            $model->caseStatus = $map['case_status'];
        }
        if (isset($map['status_ext'])) {
            $model->statusExt = $map['status_ext'];
        }
        if (isset($map['status_file_infos'])) {
            if (!empty($map['status_file_infos'])) {
                $model->statusFileInfos = [];
                $n                      = 0;
                foreach ($map['status_file_infos'] as $item) {
                    $model->statusFileInfos[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
