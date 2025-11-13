<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PreviewInnerFundmngbatchloanRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 批量放款文件
    /**
     * @var FileInfo
     */
    public $fileInfo;

    // 页面调用traceid
    /**
     * @var string
     */
    public $traceId;

    // 融资模式
    // 供应链金融：
    // SUPPLY_CHAIN_FINANCE
    // 自定义还款：
    // DEFAULT
    /**
     * @var string
     */
    public $fundMode;

    // 放款渠道
    // ALIPAY
    // BANK
    /**
     * @var string
     */
    public $loanChannel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'fileInfo'          => 'file_info',
        'traceId'           => 'trace_id',
        'fundMode'          => 'fund_mode',
        'loanChannel'       => 'loan_channel',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('fileInfo', $this->fileInfo, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->loanChannel) {
            $res['loan_channel'] = $this->loanChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewInnerFundmngbatchloanRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['file_info'])) {
            $model->fileInfo = FileInfo::fromMap($map['file_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['loan_channel'])) {
            $model->loanChannel = $map['loan_channel'];
        }

        return $model;
    }
}
