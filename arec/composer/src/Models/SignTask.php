<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class SignTask extends Model
{
    // 文件路径
    /**
     * @example /root/doucument.pdf
     *
     * @var string
     */
    public $filePath;

    // 签署信息列表
    /**
     * @example
     *
     * @var SignInfo[]
     */
    public $signInfoList;

    // 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
    /**
     * @example APPLY_FORM
     *
     * @var string
     */
    public $signDocumentType;
    protected $_name = [
        'filePath'         => 'file_path',
        'signInfoList'     => 'sign_info_list',
        'signDocumentType' => 'sign_document_type',
    ];

    public function validate()
    {
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('signInfoList', $this->signInfoList, true);
        Model::validateRequired('signDocumentType', $this->signDocumentType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->signInfoList) {
            $res['sign_info_list'] = [];
            if (null !== $this->signInfoList && \is_array($this->signInfoList)) {
                $n = 0;
                foreach ($this->signInfoList as $item) {
                    $res['sign_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signDocumentType) {
            $res['sign_document_type'] = $this->signDocumentType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['sign_info_list'])) {
            if (!empty($map['sign_info_list'])) {
                $model->signInfoList = [];
                $n                   = 0;
                foreach ($map['sign_info_list'] as $item) {
                    $model->signInfoList[$n++] = null !== $item ? SignInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_document_type'])) {
            $model->signDocumentType = $map['sign_document_type'];
        }

        return $model;
    }
}
