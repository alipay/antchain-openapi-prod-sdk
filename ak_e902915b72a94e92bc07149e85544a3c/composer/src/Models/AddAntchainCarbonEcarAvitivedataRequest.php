<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class AddAntchainCarbonEcarAvitivedataRequest extends Model
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

    // 活动数据业务单号
    /**
     * @var string
     */
    public $enterpriseBizNo;

    // 盘查排放项编码
    /**
     * @var string
     */
    public $inventoryItemNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $occurrenceEndTime;

    // 排放源用量值列表
    /**
     * @var AnyAmountItem[]
     */
    public $emissionSourceDosageList;

    // 活动数据附加要素值列表
    /**
     * @var AnyKeywordItem[]
     */
    public $emissionSourceElementList;

    // 活动数据扩展信息值列表
    /**
     * @var AnyKeywordItem[]
     */
    public $extensionValueList;

    // 凭证文件列表，每个文件通过接口/open/api/file/upload上传
    /**
     * @var EnterpriseDocumentFile[]
     */
    public $voucherFileList;

    // 备注
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'enterpriseBizNo'           => 'enterprise_biz_no',
        'inventoryItemNo'           => 'inventory_item_no',
        'occurrenceStartTime'       => 'occurrence_start_time',
        'occurrenceEndTime'         => 'occurrence_end_time',
        'emissionSourceDosageList'  => 'emission_source_dosage_list',
        'emissionSourceElementList' => 'emission_source_element_list',
        'extensionValueList'        => 'extension_value_list',
        'voucherFileList'           => 'voucher_file_list',
        'remark'                    => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseBizNo', $this->enterpriseBizNo, true);
        Model::validateRequired('inventoryItemNo', $this->inventoryItemNo, true);
        Model::validateRequired('occurrenceStartTime', $this->occurrenceStartTime, true);
        Model::validateRequired('occurrenceEndTime', $this->occurrenceEndTime, true);
        Model::validateRequired('emissionSourceDosageList', $this->emissionSourceDosageList, true);
        Model::validateMaxLength('enterpriseBizNo', $this->enterpriseBizNo, 64);
        Model::validateMaxLength('remark', $this->remark, 512);
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
        if (null !== $this->enterpriseBizNo) {
            $res['enterprise_biz_no'] = $this->enterpriseBizNo;
        }
        if (null !== $this->inventoryItemNo) {
            $res['inventory_item_no'] = $this->inventoryItemNo;
        }
        if (null !== $this->occurrenceStartTime) {
            $res['occurrence_start_time'] = $this->occurrenceStartTime;
        }
        if (null !== $this->occurrenceEndTime) {
            $res['occurrence_end_time'] = $this->occurrenceEndTime;
        }
        if (null !== $this->emissionSourceDosageList) {
            $res['emission_source_dosage_list'] = [];
            if (null !== $this->emissionSourceDosageList && \is_array($this->emissionSourceDosageList)) {
                $n = 0;
                foreach ($this->emissionSourceDosageList as $item) {
                    $res['emission_source_dosage_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->emissionSourceElementList) {
            $res['emission_source_element_list'] = [];
            if (null !== $this->emissionSourceElementList && \is_array($this->emissionSourceElementList)) {
                $n = 0;
                foreach ($this->emissionSourceElementList as $item) {
                    $res['emission_source_element_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extensionValueList) {
            $res['extension_value_list'] = [];
            if (null !== $this->extensionValueList && \is_array($this->extensionValueList)) {
                $n = 0;
                foreach ($this->extensionValueList as $item) {
                    $res['extension_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->voucherFileList) {
            $res['voucher_file_list'] = [];
            if (null !== $this->voucherFileList && \is_array($this->voucherFileList)) {
                $n = 0;
                foreach ($this->voucherFileList as $item) {
                    $res['voucher_file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddAntchainCarbonEcarAvitivedataRequest
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
        if (isset($map['enterprise_biz_no'])) {
            $model->enterpriseBizNo = $map['enterprise_biz_no'];
        }
        if (isset($map['inventory_item_no'])) {
            $model->inventoryItemNo = $map['inventory_item_no'];
        }
        if (isset($map['occurrence_start_time'])) {
            $model->occurrenceStartTime = $map['occurrence_start_time'];
        }
        if (isset($map['occurrence_end_time'])) {
            $model->occurrenceEndTime = $map['occurrence_end_time'];
        }
        if (isset($map['emission_source_dosage_list'])) {
            if (!empty($map['emission_source_dosage_list'])) {
                $model->emissionSourceDosageList = [];
                $n                               = 0;
                foreach ($map['emission_source_dosage_list'] as $item) {
                    $model->emissionSourceDosageList[$n++] = null !== $item ? AnyAmountItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['emission_source_element_list'])) {
            if (!empty($map['emission_source_element_list'])) {
                $model->emissionSourceElementList = [];
                $n                                = 0;
                foreach ($map['emission_source_element_list'] as $item) {
                    $model->emissionSourceElementList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extension_value_list'])) {
            if (!empty($map['extension_value_list'])) {
                $model->extensionValueList = [];
                $n                         = 0;
                foreach ($map['extension_value_list'] as $item) {
                    $model->extensionValueList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['voucher_file_list'])) {
            if (!empty($map['voucher_file_list'])) {
                $model->voucherFileList = [];
                $n                      = 0;
                foreach ($map['voucher_file_list'] as $item) {
                    $model->voucherFileList[$n++] = null !== $item ? EnterpriseDocumentFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
