<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class PushModelSamplefileRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 开始日期：示例 YYYYMMDD
    /**
     * @var string
     */
    public $beginDate;

    // 样本内采样日期截止日：YYYYMMDD
    /**
     * @var string
     */
    public $endDate;

    // 样本数据量
    /**
     * @var int
     */
    public $orgNums;

    // 样本批次号，唯一，建议：租户code+时间戳
    /**
     * @var string
     */
    public $sampleCode;

    // 文件路径，bucket 下路径
    /**
     * @var string
     */
    public $filePath;

    // 文件名,以.csv结尾，分隔符为  ","号
    /**
     * @var string
     */
    public $fileName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'beginDate'         => 'begin_date',
        'endDate'           => 'end_date',
        'orgNums'           => 'org_nums',
        'sampleCode'        => 'sample_code',
        'filePath'          => 'file_path',
        'fileName'          => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('beginDate', $this->beginDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('orgNums', $this->orgNums, true);
        Model::validateRequired('sampleCode', $this->sampleCode, true);
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('fileName', $this->fileName, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->beginDate) {
            $res['begin_date'] = $this->beginDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->orgNums) {
            $res['org_nums'] = $this->orgNums;
        }
        if (null !== $this->sampleCode) {
            $res['sample_code'] = $this->sampleCode;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushModelSamplefileRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['begin_date'])) {
            $model->beginDate = $map['begin_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['org_nums'])) {
            $model->orgNums = $map['org_nums'];
        }
        if (isset($map['sample_code'])) {
            $model->sampleCode = $map['sample_code'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
