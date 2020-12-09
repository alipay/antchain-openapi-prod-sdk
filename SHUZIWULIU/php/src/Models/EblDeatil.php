<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class EblDeatil extends Model {
    protected $_name = [
        'eblCopyPdfFileHash' => 'ebl_copy_pdf_file_hash',
        'eblCopyPdfFileId' => 'ebl_copy_pdf_file_id',
        'eblNo' => 'ebl_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->eblCopyPdfFileHash) {
            $res['ebl_copy_pdf_file_hash'] = $this->eblCopyPdfFileHash;
        }
        if (null !== $this->eblCopyPdfFileId) {
            $res['ebl_copy_pdf_file_id'] = $this->eblCopyPdfFileId;
        }
        if (null !== $this->eblNo) {
            $res['ebl_no'] = $this->eblNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EblDeatil
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ebl_copy_pdf_file_hash'])){
            $model->eblCopyPdfFileHash = $map['ebl_copy_pdf_file_hash'];
        }
        if(isset($map['ebl_copy_pdf_file_id'])){
            $model->eblCopyPdfFileId = $map['ebl_copy_pdf_file_id'];
        }
        if(isset($map['ebl_no'])){
            $model->eblNo = $map['ebl_no'];
        }
        return $model;
    }
    // 电子提单copy文件hash
    /**
     * @example 暂无
     * @var string
     */
    public $eblCopyPdfFileHash;

    // 电子提单copy文件id
    /**
     * @example 暂无
     * @var string
     */
    public $eblCopyPdfFileId;

    // 电子提单编号
    /**
     * @example 暂无
     * @var string
     */
    public $eblNo;

}
